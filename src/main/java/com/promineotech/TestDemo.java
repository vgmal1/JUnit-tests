package com.promineotech;

import java.util.Random;

public class TestDemo {
	public int addPositive(int a, int b) {
		if (a>0 && b>0) {
			int sum = a + b;
			return sum;
		}
		else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	// method to multiply positive numbers
	public int multiplyPositive(int a, int b) {
		// verify user input two positive numbers
		if (a>0 && b>0) {
			// multiply and return product
			int product = a * b;
			return product;
		}
		// if both params are not positive, throw an exception
		else {
			throw new IllegalArgumentException("Both parameters must be positive.");
		}
	}
	
	public int randomNumberSquared() {
		int ranNum = getRandomInt();
		return ranNum * ranNum;
	}
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}
