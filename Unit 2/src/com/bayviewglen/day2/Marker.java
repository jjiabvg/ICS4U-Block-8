package com.bayviewglen.day2;

public class Marker {
	public static void main(String[] args) {
		char[][] solutions = {
				{'A', 'B', 'C', 'D', 'B', 'A', 'B', 'E','D', 'B'},
				{'A', 'B', 'C', 'A', 'B', 'A', 'B', 'E','D', 'B'},
				{'A', 'B', 'C', 'A', 'B', 'A', 'B', 'E','D', 'B'},
				{'A', 'B', 'C', 'A', 'D', 'A', 'B', 'E','D', 'B'},
				{'A', 'B', 'C', 'A', 'B', 'D', 'D', 'E','D', 'B'},
				{'A', 'B', 'C', 'A', 'B', 'A', 'B', 'E','D', 'B'},
				{'A', 'B', 'C', 'A', 'B', 'A', 'D', 'E','D', 'B'},
				{'A', 'B', 'C', 'A', 'B', 'A', 'B', 'E','C', 'D'},
				{'A', 'B', 'C', 'A', 'B', 'A', 'B', 'E','D', 'B'},
				{'A', 'B', 'C', 'A', 'B', 'A', 'B', 'E','E', 'B'}
			};
		
		char[] answerKey = {'A', 'B', 'C', 'D', 'B', 'A', 'B', 'E', 'D', 'B'};

		int[] marks = new int[10];
		
		grade(answerKey, solutions, marks);
		display(marks);
	}
	
	public static void grade(char[] answerKey, char[][] solutions, int[] marks){
		for (int i=0; i<solutions.length; ++i){
			for (int j=0; j<answerKey.length; ++j){
				if (solutions[i][j] == answerKey[j]){
					marks[i]++;
				}
				
			}
		}
	}
	
	public static void display(int[] marks){
		for (int i=0; i<marks.length; ++i){
			System.out.println("Student " + (i+1) + " got " + marks[i] + " correct.");
		}
	}

}
