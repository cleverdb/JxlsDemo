package com.cleverbo;

import java.util.ArrayList;
import java.util.List;

public class Dept {
	private String name;
	
	private List<Employee> employees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Dept(String name, List<Employee> employees) {
		super();
		this.name = name;
		this.employees = employees;
	}
	
	public void add(Employee e) {
		if(employees == null) {
			employees = new ArrayList<>();
		}
		employees.add(e);
	}

	public Dept(String name) {
		super();
		this.name = name;
	}
	
}
