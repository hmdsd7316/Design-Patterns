package com.sid.DesignPatterns.Creational.FactoryMethod.concrete;

import com.sid.DesignPatterns.Creational.FactoryMethod.interfaces.Button;
import com.sid.DesignPatterns.Creational.FactoryMethod.interfaces.ButtonType;

public class ButtonFactory {

	public static Button getButton(ButtonType buttonType) {
		if (buttonType == ButtonType.HTML) {
			return new HtmlButton();
		} else {
			return new WindowsButton();
		}
	}
}
