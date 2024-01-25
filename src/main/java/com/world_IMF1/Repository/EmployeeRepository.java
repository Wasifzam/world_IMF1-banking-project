package com.world_IMF1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.world_IMF1.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
