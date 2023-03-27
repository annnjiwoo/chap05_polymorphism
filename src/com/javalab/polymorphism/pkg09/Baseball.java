package com.javalab.polymorphism.pkg09;

public class Baseball extends Sports{

	@Override
	public void play(Sports sports) {// 매개변수 다형성 구현 용도
		System.out.println(sports.toString() + "경기를 합니다.");
		
	}
	
	public String toString() {
		return "야구";
	}

}
