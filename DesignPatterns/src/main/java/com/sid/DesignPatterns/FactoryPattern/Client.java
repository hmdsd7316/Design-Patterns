package com.sid.DesignPatterns.FactoryPattern;

import com.sid.DesignPatterns.FactoryPattern.concrete.ButtonFactory;
import com.sid.DesignPatterns.FactoryPattern.interfaces.Button;
import com.sid.DesignPatterns.FactoryPattern.interfaces.ButtonType;

public class Client {
	public static void main(String[] args) {
		Button htmlButton = ButtonFactory.getButton(ButtonType.HTML);
		htmlButton.render();
		
		Button windowButton = ButtonFactory.getButton(ButtonType.WINDOWS);
		windowButton.render();
	}
}
