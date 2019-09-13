package com.aggreyah.javainputexample;

import java.util.Scanner;

public class JavaInputExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in your name");
		String myName = scan.next();
		scan.close();
		System.out.println("Your name is " + myName);
	}

}
