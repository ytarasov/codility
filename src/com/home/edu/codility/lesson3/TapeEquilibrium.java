package com.home.edu.codility.lesson3;

public class TapeEquilibrium {
	
	public static void main(String[] args) {
		int[] A = {-1, 2, -5};
		//int[] A = {3,1,2,4,3};	
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {		
		int size = A.length;
		long firstPartSum = 0;
		long secondPartSum = getSum(A, 0, size-1);
		int minDiff = Integer.MAX_VALUE;
		for(int i=0; i <size-1; i++) {
			firstPartSum += A[i];
			secondPartSum -= A[i];
			long diff = Math.abs(firstPartSum - secondPartSum);
			if (diff < minDiff) {
				minDiff = (int) diff; 
			}			
		}
		return minDiff;
	}

	private static long getSum(int[] A, int beginIndex, int endIndex) {
		long sum = 0;
		for(int i=beginIndex; i<=endIndex; i++) {
			sum+=A[i];
		}
		return sum;
	}
}
