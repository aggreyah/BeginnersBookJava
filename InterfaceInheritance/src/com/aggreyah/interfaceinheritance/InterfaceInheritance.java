package com.aggreyah.interfaceinheritance;

interface Interface1{
	public void method1();
}

interface Interface2 extends Interface1{
	public void method2();
}
public class InterfaceInheritance implements Interface2{

	public static void main(String[] args) {
		Interface2 obj0 = new InterfaceInheritance();
		obj0.method1();
		obj0.method2();
	}

	@Override
	public void method1() {
		System.out.println("Implementation method 1.");		
	}

	@Override
	public void method2() {
		System.out.println("Implementation method 2.");		
	}

}
