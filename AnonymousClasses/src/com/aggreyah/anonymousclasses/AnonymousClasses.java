package com.aggreyah.anonymousclasses;

public class AnonymousClasses {
	
	interface HelloWorld{
		public void greet();
		public void greetSomeone(String name);
	}
	
	public void sayHello() {
		
		class EnglishGreeting implements HelloWorld{

			String name = "World";

			@Override
			public void greet() {
				greetSomeone(name);				
			}

			@Override
			public void greetSomeone(String aName) {
				name = aName;
				System.out.println("Hello " + name);
			}
			
		}
		HelloWorld englishGreeting = new EnglishGreeting();
		
		HelloWorld frenchGreeting = new HelloWorld() {
			
			String name = "tout le monde";
			
			@Override
			public void greetSomeone(String name) {
				this.name = name;
				System.out.println("Salut " + name);				
			}
			
			@Override
			public void greet() {
				greetSomeone(name);				
			}
		};
		
		HelloWorld spanishGreeting = new HelloWorld() {
			
			String name = "mundo";
			
			@Override
			public void greetSomeone(String name) {
				this.name = name;
				System.out.println("Hola, " + name);				
			}
			
			@Override
			public void greet() {
				greetSomeone(name);				
			}
		};
		
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Aggrey");
		spanishGreeting.greetSomeone("Aggrey");
	}

	public static void main(String[] args) {
		AnonymousClasses obj0 = new AnonymousClasses();
		obj0.sayHello();
	}

}
