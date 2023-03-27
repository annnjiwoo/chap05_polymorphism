package com.javalab.polymorphism.pkg07;

public class AnimalMain {
	public static void main(String[] args) {

		// 1. 객체를 생성해서 자신의 타입에 저장(다형성 아님)
		System.out.println("[1. 객체를 생성해서 자신의 타입에 저장(다형성 아님)]");
		// 자손객체를 생성해서 자손타입에 저장
		Dog dog = new Dog();
		Cat cat = new Cat();

		// 자손이 갖고 있는 메소드를 호출해서 동물소리 내기
		dog.sound();
		cat.sound();
		
		// 2. 다형성 적용, 변수의 자동 타입 변환
		//객체를 생성해서 부모 타입에 저장함
		System.out.println("[2. 다형성 적용, 변수의 자동 타입 변환]");
		
		//부모 타입 변수 선언
		Animal animal = null;	// 객체선언불가, Animal클래스가 추상클래스이기 때문에
		
		//자손 객체(구현클래스)를 생성해서 부모타입에 저장함
		animal = new Dog();
		//부모타입으로 자식의 메소드를 호출해서 소리내기
		animal.sound();
		
		//자손 객체(구현클래스)를 생성해서 부모타입에 저장함
		animal = new Cat();
		animal.sound();	// 오버라이딩 메소드 호출
		
		//3. 매개변수의 다형성
		System.out.println("[3. 매개변수의 다형성 + 자동 타입변환]");

		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Cat();
		for (Animal ani : animals) {
			animalSound(ani);
		}
	}

	private static void animalSound(Animal animal) {
		animal.sound();
	}
	

}
