package com.aggreyah.genericclasses;

// A generic class
class Test <E>{
	E anyObj;
	public Test(E obj) {
		this.anyObj = obj;
	}
	public E getObject (){
		return this.anyObj;
	}
}

public class GenericClasses {

	public static void main(String[] args) {
		Test <Integer> anInteger = new Test<Integer>((Integer) 10);
		Test <String> aString = new Test <String>("Aggrey Ochieng");
		System.out.println("An Integer: " + anInteger.getObject());
		System.out.println("A String: " + aString.getObject());
	}

}
