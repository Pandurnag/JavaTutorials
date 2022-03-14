package com.java.tutorials.functionalinterfaces;

@FunctionalInterface
interface Printable{
	void print(String message);
}
public class CustomFunctionalInterface {

	public static void main(String[] args) {
	
	 /*	
		Printable printable = new Printable() {
			
			@Override
			public void print(String message) {
			      System.out.println(message);
				
			}
		};
		
		printable.print(" functional interfaces demo --");
		*/
		
		Printable printable = (message) -> System.out.println(message); 
		printable.print(" functional interfaces demo --"); 

	}

}
