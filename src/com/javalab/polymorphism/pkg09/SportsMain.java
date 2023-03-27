package com.javalab.polymorphism.pkg09;

public class SportsMain {
	public static void main(String[] args) {
		//선수 객체 생성
		Player player = new Player();
		
		//부모타입(종목) 클래스 변수 선언
		Sports sp = null;
		
		System.out.println("1. 객체저장을 이용한 플레이");
		
		sp = new Baseball();
		player.play(sp);
		
		sp = new Soccer();
		player.play(sp);
		
		
		
		System.out.println("2. 배열을 이용한 플레이");
		Sports[] sports = new Sports[2];
		
		sports[0] = new Baseball();
		sports[1] = new Soccer();
		
		for (int i = 0; i < sports.length; i++) {
			player.play(sports[i]);
		}

	}
	

}
