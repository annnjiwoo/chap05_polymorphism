package com.javalab.polymorphism.pkg16;

public class DriverMain {
	public static void main(String[] args) {
		System.out.println("[1] 다형성이 아닌 일반적인 객체 활용");
		Bus bus = new Bus();
		bus.run();
		Taxi taxi = new Taxi();	//taxi참조변수임 (객체)
		taxi.run();
		System.out.println();
		
		System.out.println("[2] 인터페이스와 매개변수를 활용한 다형성 구현");
		Driver driver = new Driver();
		driver.drive(taxi);	
		//driver 객체의 drive()메소드로 전달되어 자동타입변환
		// > drive()메소드에서 부모타입으로 형변환 > 부모엔 내용이 없으니 택시타입 호출되어 택시내용 보여줌
		driver.drive(bus);
		System.out.println();
		
		System.out.println("[3] 반복문 활용");
		Vehicle[] vehicleSave = new Vehicle[2];
		vehicleSave[0] = new Bus();
		vehicleSave[1] = new Taxi();
		for (Vehicle vehicle : vehicleSave) {
			driver.drive(vehicle);
		}

	}

}
