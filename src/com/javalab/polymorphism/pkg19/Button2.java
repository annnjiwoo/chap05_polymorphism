package com.javalab.polymorphism.pkg19;
/**
 * 중첩 인터페이스
 */
public class Button2 {
	// 정적 멤버 인터페이스 [중첩인터페이스]
	public static interface ClickListener {// static은 객체 생성 안하고 바로 접근 가능
		// 추상 메소드(인터페이스는 껍데기메소드(추상메소드 필수)) 
		void onClick();
	}// end 인터페이스
	
	//필드(값저장공간)
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;// 여기로 자식이 들어옴
	}
	
	//메소드
		public void click() {
			this.clickListener.onClick();	//버튼 클릭 시 실행하는 메소드
		}



}
