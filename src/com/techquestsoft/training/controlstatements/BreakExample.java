package com.techquestsoft.training.controlstatements;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using for loop
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// breaking the loop
				break;
			}
			System.out.println(i);
		}
	}

}
