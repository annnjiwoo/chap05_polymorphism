package com.javalab.polymorphism.pkg17;
//실행클래스
public class InterfaceExtendsMain {
	public static void main(String[] args) {
		//구현 객체(자식객체) 생성
		InterfaceCImp1 imp1 = new InterfaceCImp1();
		
		InterfaceA ia = imp1;	// 구현객체(자식)를 InterfaceA Type인터페이스에 저장
		ia.methodA();			// 저장한 인터페이스가 갖고 있는 메소드이름으로 자식 메소드가 호출됨
		// ia.methodB();	// (x) InterfaceA는 메소드 methodA만 호출 가능
		System.out.println();
		
		InterfaceB ib = imp1;
		//ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterFaceC ic = imp1;
		ic.methodA();
		ic.methodB();	//InterFaceC 타입 인터페이스에 저장했기 때문에 모든 메소드 호출 가능
		ic.methodC();
		
	}

}
