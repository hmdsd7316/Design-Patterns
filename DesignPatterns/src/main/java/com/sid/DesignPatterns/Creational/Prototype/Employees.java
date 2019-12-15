package com.sid.DesignPatterns.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

	private List<String> empList;
	
	public Employees() {
		this.empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list) {
		this.empList = list;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	
	public void loadData() {
		this.empList.add("Ahmad");
		this.empList.add("Sayeed");
		this.empList.add("Prem");
		this.empList.add("Vineet");
		this.empList.add("Javed");
	}	
	
	public List<String> getEmpList(){
		return this.empList;
	}
	
	@Override
	public Object clone() {
		List<String> temp = new ArrayList<String>();
		for(String value: this.empList) {
			temp.add(value);
		}
		return new Employees(temp);
	}
}
