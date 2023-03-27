package com.javalab.polymorphism.pkg17;
/**
 * 구현클래스(자식)
 *  - InterfaceC를 구현한 구현클래스(자식클래스)
 *  - InterfaceC는 InterfaceA와 InterfaceB를 상속했음
 * (메소드)의 시그니처는 InterfaceCImp1 클래스에 마우스를 갖다대면 자동으로 구현해줌
 */

public class InterfaceCImp1 implements InterFaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceCImp1 = methodA() 실행");

	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImp1 = methodB() 실행");

	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImp1 = methodC() 실행");

	}

}
