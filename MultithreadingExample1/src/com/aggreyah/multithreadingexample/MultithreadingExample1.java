package com.aggreyah.multithreadingexample;

public class MultithreadingExample1 extends Thread{
	
	public void run() {
		System.out.println("My thread is in a running state.");
	}

	public static void main(String[] args) {
		MultithreadingExample1 obj0 = new MultithreadingExample1();
		obj0.start();
	}

}
