package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.manager;

public interface HomeService {
	
	public void savedata(manager m);

	public List<manager> getalldata();

	public void deletedata(int id);

	public manager editdata(int id);


}
