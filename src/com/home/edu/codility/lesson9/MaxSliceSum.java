package com.home.edu.codility.lesson9;

public class MaxSliceSum {

	public static void main(String[] args) {
		//int[] A = {3, 2, -6, 4, 0};
		//int[] A = {-6, -2, -1, -4, -5};
		int[] A = {5, 1, 2, -1, 2};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {				
		int max = getMaxFromArray(A);
		int maxSliceSum = max;
		int maxEndingSum = 0;
		for (int i=0; i<A.length; i++) {
			maxEndingSum = getMaxFromAB(0, maxEndingSum + A[i]);
			maxSliceSum	= getMaxFromAB(maxSliceSum, maxEndingSum);			
		}
		if ((maxSliceSum == 0) && (max < 0)) {
			maxSliceSum = max;
		}
		return maxSliceSum;
	}
	
	private static int getMaxFromAB(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}
	
	private static int getMaxFromArray(int[] A) {
		int max = Integer.MIN_VALUE;
		for (int i=0; i<A.length; i++) {
			if (A[i] >= max) {
				max = A[i];
			}
		}
		return max;
	}
	
}
