package com.javalab.polymorphism.pkg14;
/**
 * 인터페이스를 구현한 클래스들을 사용하는 클래스
 * 1. 첫번째는 필드를 특정 타이어로 고정하고 테스트
 * 2. 필드를 인터페이스 타입으로 변경(다형성 적용 가능)
 */
public class Car {
	// 1. 첫번째는 필드를 특정 타이어로 고정하고 테스트
	//HankookTire hankookTire = new HankookTire();
	
	
	//2. 필드(타이어=인터페이스 타입 / 이렇게 해야 다형성 적용 가능)
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	//메소드
	void run() {
		tire1.roll();
		tire2.roll();
	}
	
	



}
