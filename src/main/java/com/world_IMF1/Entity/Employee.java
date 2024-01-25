package com.world_IMF1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 15)
	
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Column(name = "fname", length = 25)
	private String fname;
	
	private String lname;
	public String getLname() {
		return lname;
	}
	@Column(name = "lname", length = 30)
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	private String city;
	public String getCity() {
		return city;
	}
	@Column(name = "city", length = 30)
	public void setCity(String city) {
		this.city = city;
	}
	
	private long salary;
	public long getSalary() {
		return salary;
	}
	@Column(name = "salary", length = 18)
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
