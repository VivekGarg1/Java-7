package com.home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MoreThanOneTypeExceptionHandling {

	public static void main(String[] args) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test.txt"))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
		}
		int b = 10;
		System.out.println(b);
	}

}
