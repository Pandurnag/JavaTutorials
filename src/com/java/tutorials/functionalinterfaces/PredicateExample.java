package com.java.tutorials.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Person> predicate = (person) -> person.getAge() > 30;
		boolean result = predicate.test(new Person("Ramesh", 31));
		System.out.println(result);
		
	}
}

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
