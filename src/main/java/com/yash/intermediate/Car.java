package com.yash.intermediate;

public class Car {
	
	public static int count =0;
	public int speed;
	public String owner;
	public String carType;

	
	public Car(int speed, String owner, String carType) {
		
		this.speed = speed;
		this.owner = owner;
		this.carType = carType;
		count++;
	}
	
	

	/*
	 * public int getSpeed() { return speed; } public void setSpeed(int speed) {
	 * this.speed = speed; } public String getOwner() { return owner; } public void
	 * setOwner(String owner) { this.owner = owner; } public String getCarType() {
	 * return carType; } public void setCarType(String carType) { this.carType =
	 * carType; }
	 */
	
}
