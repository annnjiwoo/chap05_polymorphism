package com.javalab.polymorphism.pkg05;

public class InstanceOfMain {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		if (animal1 instanceof Dog) {
			System.out.println("개 입니다.");
		}
		
		if (animal2 instanceof Dog) {	//animal2변수의 매개변수의 값이 Dog인가?
			System.out.println("animal2는 개입니다.");
		}else if (animal2 instanceof Cat) {
			System.out.println("animal2는 고양이 입니다.");
		}
	}

}
