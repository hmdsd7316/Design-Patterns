package com.sid.DesignPatterns.Creational.Prototype;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		Employees employees = new Employees();
		employees.loadData();
		
		// Use the clone method to get the employee object
		Employees emp1 = (Employees) employees.clone();
		Employees emp2 = (Employees) employees.clone();
		
		
		List<String> list = emp1.getEmpList();
		list.add("Parul");
		list.remove("Ahmad");
		
		System.out.println("Size: " + emp1.getEmpList().size());
		System.out.println("Emp New List: " + emp1.getEmpList());
	}

}
