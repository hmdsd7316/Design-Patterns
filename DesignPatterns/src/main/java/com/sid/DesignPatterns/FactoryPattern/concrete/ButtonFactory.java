package com.sid.DesignPatterns.FactoryPattern.concrete;

import com.sid.DesignPatterns.FactoryPattern.interfaces.Button;
import com.sid.DesignPatterns.FactoryPattern.interfaces.ButtonType;

public class ButtonFactory {

	public static Button getButton(ButtonType buttonType) {
		if (buttonType == ButtonType.HTML) {
			return new HtmlButton();
		} else {
			return new WindowsButton();
		}
	}
}
