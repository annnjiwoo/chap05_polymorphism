package com.javalab.polymorphism.pkg18;

public class AMain {
	public static void main(String[] args) {
		/*
		 * 1. 바깥의 A 객체가 생성되기 전에 먼저
		 *  - 내부 클래스 B가 정의되고
		 *  - B클래스가 객체로 생성
		 * 2. A 객체가 생성됨(초기화)
		 */
		A a = new A();
		
		// 2. 안쪽의 중첩 B객체 생성
		A.B b = a.new B();	//바깥 클래스.안쪽클래스 클래스변수 = 
		b.field1 = 25;
		b.method1();
	}

}
