package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.manager;
import com.example.demo.Repo.HomeRepo;
import com.example.demo.Service.HomeService;

@Service
public class HomeDao implements HomeService
{

	@Autowired
	HomeRepo hr;
	
	@Override
	public void savedata(manager m) {
		hr.save(m);
	}

	@Override
	public List<manager> getalldata() {
		return hr.findAll();
	}

	@Override
	public void deletedata(int id) {
		 hr.deleteById(id);
	}

	@Override
	public manager editdata(int id) {
		
		return hr.getById(id);
	}

}
