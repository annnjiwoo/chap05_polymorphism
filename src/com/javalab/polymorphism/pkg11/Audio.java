package com.javalab.polymorphism.pkg11;
//구현클래스
public class Audio implements RemoteControl{
	//필드
	private int volume;
	
	//trunOn() 추상메소드 오버라이딩
	@Override
	public void trunOn() {
		System.out.println("Audio를 켭니다.");
		
	}
	
	//trunOff() 추상메소드 오버라이딩
	@Override
	public void trunOff() {
		System.out.println("Audio를 끕니다.");
		
	}
	
	//setVolume() 추상메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	};
}
