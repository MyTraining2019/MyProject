package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
	
		String[] str= {"tom","jerry","jack","sam","kamal"};
		for(String s:str)
			System.out.println(s);
		
		System.out.println("Welcome! Sales Application!");
		SalesClass obj=new SalesClass();
		obj.show();
		display();

	}
	
	public static void display() {
		System.out.println("Hello! Good Morning!");
		System.out.println("Hello! I am working in Java");
		System.out.println("I am Java Full Stack Developer!");
	}

}
