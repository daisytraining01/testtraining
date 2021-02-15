package com.maveric.testproject;

public class SecondTest {
	
	public static void main(String[] args) {
		
		FirstTest firstTest = new FirstTest();
		
		System.out.println(firstTest.add(2, 3));
		
		FirstTest.sub(5, 3);
		
	}

}
