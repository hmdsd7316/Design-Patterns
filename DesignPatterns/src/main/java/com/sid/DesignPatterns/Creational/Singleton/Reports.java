package com.sid.DesignPatterns.Creational.Singleton;

public class Reports {
	
	static class Instance{
		private static Reports instance;
		
		public static Reports getInstance() {
			if(instance == null) {
				instance = new Reports();
			}
			
			return instance;
		}
	}
	
	public static Reports getInstance() {
		return Instance.getInstance();
	}
	
	public void printLog(String message) {
		System.out.println(message);
	}
}
