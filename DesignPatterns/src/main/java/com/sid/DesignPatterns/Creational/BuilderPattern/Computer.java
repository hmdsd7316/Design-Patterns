package com.sid.DesignPatterns.Creational.BuilderPattern;

public class Computer {
	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsEnabled = builder.isGraphicsEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}
	
	public String getHDD() {
		return HDD;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}

	public void setGraphicsEnabled(boolean isGraphicsEnabled) {
		this.isGraphicsEnabled = isGraphicsEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	public static class ComputerBuilder {
		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraphicsEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}
		
		
		public ComputerBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}

}
