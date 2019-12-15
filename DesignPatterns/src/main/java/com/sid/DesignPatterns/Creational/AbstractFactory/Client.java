package com.sid.DesignPatterns.Creational.AbstractFactory;

import com.sid.DesignPatterns.Creational.AbstractFactory.concrete.HtmlDialog;
import com.sid.DesignPatterns.Creational.AbstractFactory.concrete.WindowDialog;

public class Client {

	private static Dialog dialog;

	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}

	private static void configure() {
//		System.setProperty("os.name", "Windows");
		if (System.getProperty("os.name").equals("Windows")) {
			dialog = new WindowDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}

	private static void runBusinessLogic() {
		dialog.renderWindow();
	}

}
