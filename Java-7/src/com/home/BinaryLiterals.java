package com.home;

public class BinaryLiterals {

	public static void main(String[] args) {
		// An 8-bit 'byte' value
		byte aByte = 0b1011;
		System.out.println(aByte);

		// An 16-bit 'short' value
		short aShort = (short)0b101110101;
		System.out.println(aShort);

		// An 32-bit 'int' value
		int anInt= 0b101100000;
		System.out.println(anInt);

		// An 64-bit 'long' value
		long along = 0b10110101010101l;
		System.out.println(along);
	}

}
