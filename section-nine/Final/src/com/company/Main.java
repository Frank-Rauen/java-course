package com.company;

public class Main {

    public static void main(String[] args) {
	TestClass one = new TestClass("one");
	TestClass two = new TestClass("two");
	TestClass three = new TestClass("three");
	TestClass four = new TestClass("four");

	System.out.println(Math.PI);

	int pw = 123456;
	Password password = new ExtendedPassword(pw);
	password.storePassword();

	password.letMeIn(1);
	password.letMeIn(4536);
	password.letMeIn(12345);
	password.letMeIn(pw);

		System.out.println("Main method called");
		SIBTest test = new SIBTest();
		test.someMethod();
		System.out.println(SIBTest.owner);

    }
}
