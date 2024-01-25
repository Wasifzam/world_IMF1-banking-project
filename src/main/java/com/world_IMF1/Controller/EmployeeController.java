package com.world_IMF1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.world_IMF1.Entity.Employee;
import com.world_IMF1.Services.EmployeeServices;

@Controller
public class EmployeeController 
{
	@Autowired
	private EmployeeServices abc;
	@RequestMapping("/show1")
	public String save()
	{
		return "imf";
	}
	@RequestMapping("/save")
	public String saving  (Employee e)
	{
		abc.savedata(e);
		return "imf";
	}
	

}
