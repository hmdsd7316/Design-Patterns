package com.sid.DesignPatterns.AbstractFactory.concrete;

import com.sid.DesignPatterns.AbstractFactory.Button;

public class HtmlButton implements Button {

	public void render() {
		System.out.println("<button>Test Button</button>");
		onClick();
	}

	public void onClick() {
		System.out.println("Click! Button says = 'Hello World!'");
	}

}
