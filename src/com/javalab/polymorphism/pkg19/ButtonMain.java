package com.javalab.polymorphism.pkg19;

//중첩 인터페이스를 테스트할 실행클래스
public class ButtonMain {
	public static void main(String[] args) {
		
		// ok 버튼 객체 생성
		Button2 btnOk = new Button2();

		// [중첩클래스(자식)] Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬클래스)
		class OkListener implements Button2.ClickListener {//여기서 ClickListener는 인터페이스
			// 클래스 안에 또 클래스 >> 중첩클래스
			@Override // 인터페이스의 자식(구현클래스)는 필수로 오버라이딩 해야함
			public void onClick() {// 인터페이스에 시그니처가 생기고, 안에 내용을 적어야함 (인터페이스는 내용부가 없기때문)
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}

		// Ok 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());

		// Ok 버튼 클릭하기
		btnOk.click();
		

		// Cancel 버튼 객체 생성
		Button2 btnCancel = new Button2();

		// cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬클래스)
		class CancelListener implements Button2.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}

		// Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());

		// Cancel 버튼 클릭하기
		btnCancel.click();
	}

}
