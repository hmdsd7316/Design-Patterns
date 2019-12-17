package com.sid.DesignPatterns.Structural.Adapter.round;

public class RoundPeg {
	
	private double radius;
	
	public RoundPeg() {
		// default constructor
	}
	
	public RoundPeg(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
}
