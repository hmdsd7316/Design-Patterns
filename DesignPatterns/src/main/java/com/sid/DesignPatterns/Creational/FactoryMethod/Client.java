package com.sid.DesignPatterns.Creational.FactoryMethod;

import com.sid.DesignPatterns.Creational.FactoryMethod.concrete.ButtonFactory;
import com.sid.DesignPatterns.Creational.FactoryMethod.interfaces.Button;
import com.sid.DesignPatterns.Creational.FactoryMethod.interfaces.ButtonType;

public class Client {
	public static void main(String[] args) {
		Button htmlButton = ButtonFactory.getButton(ButtonType.HTML);
		htmlButton.render();
		
		Button windowButton = ButtonFactory.getButton(ButtonType.WINDOWS);
		windowButton.render();
	}
}