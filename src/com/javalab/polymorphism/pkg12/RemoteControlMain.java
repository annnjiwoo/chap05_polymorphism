package com.javalab.polymorphism.pkg12;

public class RemoteControlMain {
	public static void main(String[] args) {
		
		RemoteControl remocon;	//리모컨 기능만 있는 인터페이스 타입 변수 선언 (사용은 못함)
		
		// 1. 리모컨 기능만 있는 Television 사용
		// 텔레비전 객체 생성해서 인터페이스 타입에 저장
		remocon = new Television();	// 구현 객체 대입 (자동타입변환)
		remocon.trunOn();			// 구현 객체의 메소드가 호출
		remocon.trunOff();			// 구현 객체의 메소드가 호출
		System.out.println();
		
		//Searhable sh = new Television();
		//sh.search("www.naver.com");
		
		//2.smartTV를 작동하는 경우
		SmartTelevision sTV = new SmartTelevision();	//다중 구현한 클래스
		//SmartTelevision은 RemoteControl, Searhable 2개의 인터페이스를 상속하여, 두개의 자식으로 가능..
		//인터페이스 타입 변수에 저장
		RemoteControl remocon2 = sTV;	//자동 타입 변환
		Searhable sh = sTV;				//자동 타입 변환
		remocon2.trunOn();				// 구현 객체의 메소드가 호출
		remocon2.setVolume(6);			// 구현 객체의 메소드가 호출
		
		sh.search("www.naver.com");
		remocon2.trunOff();
		
	}

}
