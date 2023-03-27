package com.javalab.polymorphism.pkg10;

public class RemoteControlMain {
	public static void main(String[] args) {
		// 1. 인터페이스를 사용하지 않는 평범한 경우
		Television tv = new Television();
		tv.turnON();

		// 2. 인터페이스를 사용하는 경우
		RemoteControl rc = null; // 인터페이스 타입 변수 rc 생성

		// rc변수에 Television 객체를 대입 (일종의 자동 타입 변환)
		rc = new Television();
		// 부모타입의 turnON()는 감춰지고 구현 객체(자식)의 메소드가 호출됨.
		rc.turnON();

		// rc변수에 Audio 객체를 대입 (교체시킴)
		rc = new Audio();
		rc.turnON();

		RemoteControl[] remoteControls = new RemoteControl[2];
		remoteControls[0] = new Television();
		remoteControls[1] = new Audio();

		for (RemoteControl remoteControl : remoteControls) {
			remoteControl.turnON();
		}

		for (int i = 0; i < remoteControls.length; i++) {
			remoteControls[i].turnON();
		}
	}

}
