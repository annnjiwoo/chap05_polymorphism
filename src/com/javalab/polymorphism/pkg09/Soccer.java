package com.javalab.polymorphism.pkg09;

public class Soccer extends  Sports{

	@Override
	public void play(Sports sports) {
		System.out.println(sports.toString() + "경기를 합니다.");
		
	}
	public String toString() {
		return "축구";
	}

}
