package com.javalab.polymorphism.pkg01;

public class Child2 extends Parent {
	
	@Override // 오버라이딩 검사역할
	public void showPersonality() {
		System.out.println("둘째의 성격은 아주 활달하고 적극적입니다.");
	}
}
