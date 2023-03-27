package com.javalab.polymorphism.pkg02;

public class CarMain {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		//Tire 객체 장착
		myCar.tire = new Tire();	// tire 필드에 Tire 클래스 장착
		myCar.run();
		
		//HankookTire 객체 장착
		myCar.tire = new HankookTire();	// tire 필드에 HankookTire 클래스 장착
		myCar.run();
		
		//KumhoTire 객체 장착
		myCar.tire = new KumhoTire();	// tire 필드에 KumhoTire 클래스 장착
		myCar.run();
		
		
	}

}
