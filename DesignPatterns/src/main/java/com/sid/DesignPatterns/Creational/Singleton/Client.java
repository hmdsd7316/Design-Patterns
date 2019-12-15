package com.sid.DesignPatterns.Creational.Singleton;

public class Client {
	public static void main(String[] args) {
		System.out.println(Reports.getInstance());
		System.out.println(Reports.getInstance());
		System.out.println(Reports.getInstance());
		
		Reports reports = Reports.getInstance();
		reports.printLog("Hi I am using Singleton");
	}
}
