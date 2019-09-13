package com.aggreyah.websiteclass;

public class WebsiteClass {
	// Instance Variables
	private String webName;
	private int webAge;
	
	// Constructor
	public WebsiteClass(String name, int age) {
		this.webName = name;
		this.webAge = age;
	}

	public static void main(String[] args) {
		// Creating Objects.
		WebsiteClass obj0 = new WebsiteClass("BeginnersBook", 5);
		WebsiteClass obj1 = new WebsiteClass("Google", 18);
		// Accessing object data through reference.
		System.out.println(obj0.webName + " " + obj0.webAge);
		System.out.println(obj1.webName + " " + obj1.webAge);
	}

}
