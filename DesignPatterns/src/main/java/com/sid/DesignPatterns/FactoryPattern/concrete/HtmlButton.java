package com.sid.DesignPatterns.FactoryPattern.concrete;

import com.sid.DesignPatterns.FactoryPattern.interfaces.Button;

public class HtmlButton implements Button {

	public void render() {
		System.out.println("<button>Test Button</button>");
		onClick();
	}

	public void onClick() {
		System.out.println("Click! Button says = 'Hello World!'");
	}

}
