package com.sid.DesignPatterns.BuilderPattern;

import com.sid.DesignPatterns.BuilderPattern.Computer.ComputerBuilder;

public class Client {
	public static void main(String[] args) {
		Computer computer = new ComputerBuilder("500 GB", "2GB").setBluetoothEnabled(false).setGraphicsEnabled(true).build();
		System.out.println("HDD: " + computer.getHDD());
		System.out.println("RAM: " + computer.getRAM());
		System.out.println("Is Bluetooth Enabled: " + computer.isBluetoothEnabled());
		System.out.println("Is Graphics Enabled: " + computer.isGraphicsEnabled());
	}
}
