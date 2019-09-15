package com.aggreyah.arraylistexample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		List<Integer> integerList = new ArrayList<Integer>();
		// populate string list
		stringList.add("Aggrey Ochieng");
		stringList.add("Jeff Dean");
		stringList.add("Sanjay gamawatt");
		// populate integer list
		integerList.add(20);
		integerList.add(56);
		integerList.add(170);
		System.out.print("String list: ");
		System.out.println(stringList);
		System.out.print("Integer list: ");
		System.out.println(integerList);
	}

}
