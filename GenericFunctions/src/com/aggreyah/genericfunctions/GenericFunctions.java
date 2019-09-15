package com.aggreyah.genericfunctions;

public class GenericFunctions {
	
	public <T> void genericDisplay(T genericElem) {
		System.out.println(genericElem.getClass().getName() + " " + genericElem);
	}

	public static void main(String[] args) {
		GenericFunctions obj0 = new GenericFunctions();
		obj0.genericDisplay("Aggrey Ochieng");
		obj0.genericDisplay(20);
		obj0.genericDisplay(120000.678);
	}

}
