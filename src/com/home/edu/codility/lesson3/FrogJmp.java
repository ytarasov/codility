package com.home.edu.codility.lesson3;

public class FrogJmp {
	
	public static void main(String[] args) {		
		System.out.print(solution(0, 1000000000, 5));		
	}
	
	public static int solution(int X, int Y, int D) {
		if (X >= Y || D == 0) {
			return 0;
		}		
		int n = ((Y - X) / D);
		if ((Y - X) % D == 0) {
			return n;
		}
		return n + 1;  
	}
	
}
