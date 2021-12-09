package com.techno.basic;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random ran = new Random();
		for (int i = 0; i <= 6; i++) {
			System.out.println(ran.nextInt(5));
		}
	}

}
