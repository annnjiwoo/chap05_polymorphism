package com.javalab.polymorphism.pkg12;
/**
 * 인터페이스 : 자손들이 반드시 구현해야할 빈 껍데기 메소드를 정의해놓은 클래스
 *  - 인터페이스의 추상메소드는 반드시!! 구현해야함 안하면 컴파일 단계에서 오류남
 *  - 인터페이스에 상수 필드 선언
 */

public interface RemoteControl {
	//상수 필드(상수 앞에는 public static이 생략됨)
	//static 정적변수라 객체 생성 없이도 사용 가능함.
	// 인터페이스 상수는  public static이기 때문에 [인터페이스이름.상수]로 접근
	public static int MAX_VOLUME = 10;
	public static int MIN_VOLUME = 0;
	
	//추상 메소드
	void trunOn();
	void trunOff();
	void setVolume(int volume);

}
