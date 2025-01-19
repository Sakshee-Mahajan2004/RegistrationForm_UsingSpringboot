package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.manager;
import com.example.demo.Service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService hs;
	
	
	@RequestMapping("/")
	public String one()
	{
		return "homepage";
	}

	@PostMapping("/saveinfo")
	public String save(@ModelAttribute("m1") manager m1)
	{
		hs.savedata(m1);
		System.out.println(m1);
		return "redirect:/display";
	}
	
	@GetMapping("/display")
	public String disp(Model m)
	{
		List<manager>lm=hs.getalldata();
		m.addAttribute("temp",lm);
		System.out.println(lm);
		
		return "display";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable int id)
	{
		hs.deletedata(id);
		return "redirect:/display";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model mm)
	{
		manager m=hs.editdata(id);
		System.out.println(m);
		mm.addAttribute("kk", m);
		
		return "edit";
	}
	
	@PostMapping("/editinfo")
	public String update(@ModelAttribute("mr") manager mr)
	{
		manager mn=new manager();
		mn.setId(mr.getId());
		mn.setName(mr.getName());
		mn.setEmail(mr.getEmail());
		mn.setPass(mr.getPass());
		mn.setCode(mr.getCode());
		mn.setPhone(mr.getPhone());
		
		hs.savedata(mn);
		return "redirect:/display";
	}
	
}
