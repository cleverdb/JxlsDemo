package com.cleverbo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Employee {
	
	private String name;
	
	private Integer age;
	
	private BigDecimal salary;
	
	private Timestamp birth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Timestamp getBirth() {
		return birth;
	}

	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}

	public Employee(String name, Integer age, BigDecimal salary, Timestamp birth) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.birth = birth;
	}
	
	
}
