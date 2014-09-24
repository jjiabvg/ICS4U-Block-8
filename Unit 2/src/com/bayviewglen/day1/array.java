package com.bayviewglen.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) throws FileNotFoundException {
		String[] allWords = new String[1000];
		int wordCount = 0;

		Scanner input = new Scanner(new File("input/data.txt"));
		while (input.hasNext()) {
			String word = input.next();
			allWords[wordCount] = word;
			wordCount++;
		}

		String [] newArray = new String[wordCount]; 
		for (int i = 0; i<wordCount;i++){
			newArray[i] = allWords[i]; 
		}

		Arrays.sort(newArray);


		for (int i = wordCount-1; i>0;--i){
			System.out.println(newArray[i]); 

		}
		System.out.println("**********************************"); 
		allWords = new String[wordCount - 1];
		for(int i = 0; i< wordCount;++i){
			allWords[i] = newArray[i]; 
			
		}
		

	}

}
