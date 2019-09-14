package com.aggreyah.multipleinheritancewithinterfaces;

public class MultipleInheritanceWithInterfaces implements InterfaceA, InterfaceB {

	public static void main(String[] args) {
		MultipleInheritanceWithInterfaces obj0 = new MultipleInheritanceWithInterfaces();
		obj0.method1();
		obj0.method2();
	}

	@Override
	public void method2() {
		System.out.println("Implementation method 2.");		
	}

	@Override
	public void method1() {
		System.out.println("Implementation method 1.");			
	}

}
