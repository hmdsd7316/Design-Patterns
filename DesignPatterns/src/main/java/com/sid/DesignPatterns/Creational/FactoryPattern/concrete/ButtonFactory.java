package com.sid.DesignPatterns.Creational.FactoryPattern.concrete;

import com.sid.DesignPatterns.Creational.FactoryPattern.interfaces.Button;
import com.sid.DesignPatterns.Creational.FactoryPattern.interfaces.ButtonType;

public class ButtonFactory {

	public static Button getButton(ButtonType buttonType) {
		if (buttonType == ButtonType.HTML) {
			return new HtmlButton();
		} else {
			return new WindowsButton();
		}
	}
}
