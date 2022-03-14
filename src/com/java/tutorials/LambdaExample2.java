package com.java.tutorials;

interface Printable{
	void print(String message);
}
public class LambdaExample2 {
	
	public static void main(String[] args) {
		/*
		printable printable = new printable() {
			
			@Override
			public void print(String message) {
				System.out.println(message);
				
			}
		};
		
		printable.print(" lambda example with single parameter");
		*/
		
		Printable printable = (message) -> System.out.println(message);
		printable.print("lambda example with single parameter");
	}

}
