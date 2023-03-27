package com.javalab.polymorphism.pkg17;
/**
 * 다중상속 인터페이스
 *  - 인터페이스가 다른 인터페이스를 동시에 여러개 상속받는 구조
 */
public interface InterFaceC extends InterfaceA, InterfaceB{
	//인터페이스<>인터페이스 이기때문에 여러개 상속 가능
	// 추상메소드
	void methodC();
}
