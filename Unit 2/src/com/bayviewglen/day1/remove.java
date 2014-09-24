package com.bayviewglen.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class remove {
	public static void main(String[] args) throws FileNotFoundException {
		String[] allWords = new String[1000];
		int wordCount = 0;

		Scanner input = new Scanner(new File("input/data.txt"));
		while (input.hasNext()) {
		    String word = input.next();
		    allWords[wordCount] = word;
		    wordCount++;
		}
		
		
}
}