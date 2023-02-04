package org.test;

public class Test {
	
	
	private void test1() {
		System.out.println("test1");

	}
	
	private void test3() {
		
		int a=5,b=5;
		int add = a + b;
		System.out.println(add);

	}

	public static void main(String[] args) {
		
		
		Test test = new Test();
		test.test1();
		test.test3();
	}
}
