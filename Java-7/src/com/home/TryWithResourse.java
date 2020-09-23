package com.home;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourse {

	public static void main(String[] args) {
		try(BufferedReader bufferedReader=new BufferedReader(new FileReader("src/test.txt"))) {
			String line;
			while((line=bufferedReader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
