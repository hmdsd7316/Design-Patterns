package com.sid.DesignPatterns.Creational.FactoryMethod.concrete;

import com.sid.DesignPatterns.Creational.FactoryMethod.interfaces.Button;

public class HtmlButton implements Button {

	public void render() {
		System.out.println("<button>Test Button</button>");
		onClick();
	}

	public void onClick() {
		System.out.println("Click! Button says = 'Hello World!'");
	}

}
