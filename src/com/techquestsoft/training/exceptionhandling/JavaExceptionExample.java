package com.techquestsoft.training.exceptionhandling;

public class JavaExceptionExample {
	public static void main(String args[]) {
		try {
			// code that may raise exception
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}
