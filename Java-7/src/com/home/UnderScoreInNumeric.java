package com.home;

public class UnderScoreInNumeric {

	public static void main(String[] args) {
		int a=1234_567;
		System.out.println(a);
		byte b=0b1010;
		System.out.println(b);
		float pi=3.14_15F;
		System.out.println(pi);
		
		//Invalid
		//int c=_1234_567;
		//int d=1234_567_;
	}

}
