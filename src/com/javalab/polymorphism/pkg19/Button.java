package com.javalab.polymorphism.pkg19;
/**
 * 중첩 인터페이스
 */
public class Button {
	// 정적 멤버 인터페이스
	public static interface ClickListener {// static은 객체 생성 안해도 됨
		// 추상 메소드
		void onClick();
	}// end 인터페이스

}
