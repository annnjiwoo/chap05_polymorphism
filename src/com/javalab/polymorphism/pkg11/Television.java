package com.javalab.polymorphism.pkg11;

public class Television implements RemoteControl {

	private int volume;

	//구현메소드
	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다.");
		
	}
	
	//구현메소드 (인터페이스의 추상 메소드 오버라이딩)
	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다.");
		
	}
	
	//구현메소드 (인터페이스의 추상 메소드 오버라이딩)
	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}

}
