package com.home.edu.codility.lesson6;

import java.util.Arrays;

public class Triangle {
	
	public static void main(String[] args) {		
		//int[] A = {10, 2, 5, 1, 8, 20};
		int[] A = {10, 50, 5, 1};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {
		int N = A.length;
		Arrays.sort(A);		
		for (int i=1; i<N-1; i++) {
			if ((long)A[i-1] + (long)A[i] > A[i+1]) {
				return 1;
			}
		}
		return 0;
	}
	
}
