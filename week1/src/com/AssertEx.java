package com;

import java.util.Scanner;

public class AssertEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner ss = new Scanner(System.in);
		int val = ss.nextInt();
		assert val>18:"Not Valid";
		System.out.println("The entered value is: "+val);

	}

}
