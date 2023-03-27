package com.javalab.polymorphism.pkg08;

public class VehicleMain {
	public static void main(String[] args) {
		// 운전기사 클래스 객체 생성
		Driver driver = new Driver();

		// 부모타입 배열변수 준비 2칸
		// 배열에 자식 객체 저장 (두개)
		Vehicle[] vehicleSave = new Vehicle[2];
		vehicleSave[0] = new Bus();
		vehicleSave[1] = new Taxi();

		// 반복문으로 실행
		for (Vehicle vehicle : vehicleSave) {
			driver.drive(vehicle);
		}

	}

}
