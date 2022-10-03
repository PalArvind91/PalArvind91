package com.yash.intermediate;

public class CarSold {
	
	public int carSoldCount(int n) {
		
	for(int i=0;i<n;i++) {
		createCar();
	}

	return Car.count;
	
	}
	
	public static Car createCar() {
		
		Car car = new Car(180,"abc","sports");
		return car;
	}

}
