package com.home.edu.codility.lesson6;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		//int[] A = {-3, 1, 2, -2, 5, 6};
		int[] A = {4, 7, 3, 2, 1, -3, -5};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {		
		int N = A.length;        
		Arrays.sort(A);		 
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		if (N == 3) {
			return A[0]*A[1]*A[2]; 
		}
		if (Math.abs(A[0]) >= A[N-2] && Math.abs(A[1]) >= A[N-3] && A[1] < 0 && A[N-1] > 0) {
			a1 = A[0];
			a2 = A[1];			
		} else {
			a1 = A[N-3];
			a2 = A[N-2];
		}
		a3 = A[N-1];		
		
		return a1 * a2 * a3;
	}
	
}
