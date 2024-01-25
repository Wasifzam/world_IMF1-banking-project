package com.world_IMF1.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world_IMF1.Entity.Employee;
import com.world_IMF1.Repository.EmployeeRepository;

	@Service
public class EmployeeServiceimp implements EmployeeServices {
	
	@Autowired
	private EmployeeRepository erepo;
	@Override
	public void savedata(Employee e)
	{
		erepo.save(e);
	}
	
}
