package com.aggreyah.dog;

abstract class Animal{
	public abstract void animalSound();
}

public class Dog extends Animal {

	public static void main(String[] args) {
		Animal obj0 = new Dog();
		obj0.animalSound();
	}

	@Override
	public void animalSound() {
		System.out.println("Woof!");
	}

}
