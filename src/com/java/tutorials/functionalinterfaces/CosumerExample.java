package com.java.tutorials.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CosumerExample {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Tony", 45));
		list.add(new Person("Tom", 45));
		list.add(new Person("Ramesh", 29));
		
		list.forEach((person) -> {
			System.out.println(person.getName());
		});
		
		Consumer<Person> consumer = ((person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});
		
		consumer.accept(new Person("Ramesh", 29));

	}

}
