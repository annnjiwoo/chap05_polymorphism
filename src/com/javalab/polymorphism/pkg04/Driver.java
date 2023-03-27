package com.javalab.polymorphism.pkg04;

public class Driver {
	//운전 메소드 선언(파라미터를 부모 타입으로 받고 있음. 자동형변환)
	public void driver(Vehicle vehicle) {
		vehicle.run();
	}

}
