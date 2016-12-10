package com.home.edu.codility.lesson6;

import java.util.Arrays;

public class Distinct {

	public static void main(String[] args) {		
		int[] A = {};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {
		int N = A.length;
		Arrays.sort(A);
		int count = 0;
		if (N == 0) {
			return 0; 
		}
		if (N == 1) {
			return 1;
		}
		
		for (int i=1; i<N; i++) {
			if (A[i] != A[i-1]) {
				count++;
			}
		}
		
		return count + 1;
	}
	
}
