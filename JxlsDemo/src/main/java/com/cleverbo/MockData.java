package com.cleverbo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MockData {

	public static List<Dept> create(){
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		List<Dept> depts = new ArrayList<Dept>();
		Dept dtpt0 = new Dept("财务");
		dtpt0.add(new Employee("one", 18, new BigDecimal(8903.33), timestamp));
		dtpt0.add(new Employee("two", 19, new BigDecimal(8903.33), timestamp));
		dtpt0.add(new Employee("third", 199, new BigDecimal(8903.00), timestamp));
		dtpt0.add(new Employee("four", 18, new BigDecimal(8903.33009), timestamp));
		dtpt0.add(new Employee("five", 166, new BigDecimal(8903.3366), timestamp));
		
		Dept dtpt1 = new Dept("销售");
		dtpt1.add(new Employee("张三", 18, new BigDecimal(8903.33), timestamp));
		dtpt1.add(new Employee("李四", 19, new BigDecimal(8903.33), timestamp));
		dtpt1.add(new Employee("王五", 199, new BigDecimal(8903.00), timestamp));
		dtpt1.add(new Employee("赵六", 18, new BigDecimal(8903.33009), timestamp));
		dtpt1.add(new Employee("陈七", 166, new BigDecimal(8903.3366), timestamp));
		
		Dept dtpt2 = new Dept("工程师");
		dtpt2.add(new Employee("猿人", 18, new BigDecimal(8903.33), timestamp));
		dtpt2.add(new Employee("狼人", 19, new BigDecimal(8903.33), timestamp));
		dtpt2.add(new Employee("xx", 199, new BigDecimal(8903.00), timestamp));
		dtpt2.add(new Employee("vvv", 18, new BigDecimal(8903.33009), timestamp));
		dtpt2.add(new Employee("ggg", 166, new BigDecimal(8903.3366), timestamp));

		depts.add(dtpt0);
		depts.add(dtpt1);
		depts.add(dtpt2);
		return depts;
	}
	
	public static List<List<Employee>> create2(){
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		List<List<Employee>> depts = new ArrayList<List<Employee>>();
		List<Employee> list1 = new ArrayList<>();
		//Dept dtpt0 = new Dept("财务");
		list1.add(new Employee("one", 18, new BigDecimal(8903.33), timestamp));
		list1.add(new Employee("two", 19, new BigDecimal(8903.33), timestamp));
		list1.add(new Employee("third", 199, new BigDecimal(8903.00), timestamp));
		list1.add(new Employee("four", 18, new BigDecimal(8903.33009), timestamp));
		list1.add(new Employee("five", 166, new BigDecimal(8903.3366), timestamp));
		
		List<Employee> list2 = new ArrayList<>();
		//Dept dtpt1 = new Dept("销售");
		list2.add(new Employee("张三", 18, new BigDecimal(8903.33), timestamp));
		list2.add(new Employee("李四", 19, new BigDecimal(8903.33), timestamp));
		list2.add(new Employee("王五", 199, new BigDecimal(8903.00), timestamp));
		list2.add(new Employee("赵六", 18, new BigDecimal(8903.33009), timestamp));
		list2.add(new Employee("陈七", 166, new BigDecimal(8903.3366), timestamp));
		
		List<Employee> list3 = new ArrayList<>();
		//Dept dtpt2 = new Dept("工程师");
		list3.add(new Employee("猿人", 18, new BigDecimal(8903.33), timestamp));
		list3.add(new Employee("狼人", 19, new BigDecimal(8903.33), timestamp));
		list3.add(new Employee("xx", 199, new BigDecimal(8903.00), timestamp));
		list3.add(new Employee("vvv", 18, new BigDecimal(8903.33009), timestamp));
		list3.add(new Employee("ggg", 166, new BigDecimal(8903.3366), timestamp));

		depts.add(list1);
		depts.add(list2);
		depts.add(list3);
		return depts;
	}
	
	
}
