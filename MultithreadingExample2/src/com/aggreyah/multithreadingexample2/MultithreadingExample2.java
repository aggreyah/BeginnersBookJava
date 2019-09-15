package com.aggreyah.multithreadingexample2;

public class MultithreadingExample2 implements Runnable{

	public static void main(String[] args) {
		MultithreadingExample2 obj0 = new MultithreadingExample2();
		Thread tobj0 = new Thread(obj0);
		tobj0.run();
	}

	@Override
	public void run() {
		System.out.println("My thread is in a running state.");		
	}

}
