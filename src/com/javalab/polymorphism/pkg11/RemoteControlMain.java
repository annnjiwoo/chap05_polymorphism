package com.javalab.polymorphism.pkg11;

public class RemoteControlMain {
	public static void main(String[] args) {
		//인터페이스 변수 선언
		//값을 넣을 순 있지만 쓸 수 없음
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.trunOn();	// TV켬
		rc.setVolume(11);
		rc.trunOff();	// TV끔
		System.out.println();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.trunOn();
		rc.setVolume(-1);
		rc.trunOff();
		System.out.println();
		
		
		// 다형성 구현을 위한 배열 선언
		RemoteControl[] rcs = new RemoteControl[2];
		rcs[0] = new Television();
		rcs[1] = new Audio();
		
		for (RemoteControl remoteControl : rcs) {
			remoteControl.trunOn();
			remoteControl.trunOff();
			System.out.println();
		}
		
	}

}
