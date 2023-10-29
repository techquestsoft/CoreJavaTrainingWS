package com.techquestsoft.training.thiskeyword;

public class DefaultConstructorFromParameterizedConstructor {

	DefaultConstructorFromParameterizedConstructor() {
		System.out.println("hello a");
	}

	DefaultConstructorFromParameterizedConstructor(int x) {
		this();
		System.out.println(x);
	}
}
