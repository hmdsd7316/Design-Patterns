package com.sid.DesignPatterns.AbstractFactory.concrete;

import com.sid.DesignPatterns.AbstractFactory.Button;
import com.sid.DesignPatterns.AbstractFactory.Dialog;

public class WindowDialog extends Dialog{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
