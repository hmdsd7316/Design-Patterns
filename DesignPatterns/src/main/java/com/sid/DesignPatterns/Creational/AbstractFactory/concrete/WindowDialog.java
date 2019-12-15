package com.sid.DesignPatterns.Creational.AbstractFactory.concrete;

import com.sid.DesignPatterns.Creational.AbstractFactory.Button;
import com.sid.DesignPatterns.Creational.AbstractFactory.Dialog;

public class WindowDialog extends Dialog{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
