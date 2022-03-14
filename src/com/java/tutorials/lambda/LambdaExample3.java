package com.java.tutorials.lambda;

/**
 * 
 * @author PANDURANG PATIL
 *
 */

public class LambdaExample3 {

	public static void main(String[] args) {
		
		// Lambda Example 3
		Thread thread = new Thread(() ->System.out.println(" Thread name => " + Thread.currentThread().getName()));
		thread.start();

	}
}

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(" Thread name => " + Thread.currentThread().getName());
		
	}
	
}
