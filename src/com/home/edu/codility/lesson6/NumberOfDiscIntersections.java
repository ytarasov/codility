package com.home.edu.codility.lesson6;

public class NumberOfDiscIntersections {
	
	public static void main(String[] args) {		
		int[] A = {1, 5, 2, 1, 4, 0};
		//int[] A = {1, 2147483647, 0}; expected 2
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {
		int N = A.length;
		int count = 0;
		for(int i=0; i<N-1; i++) {
			for (int j=i+1; j<N; j++) {
				if (((long) i + (long)A[i]) >= ((long)j - (long)A[j])) {
					count++;
					if (count > 10000000) {
						return -1;
					}
				}				
			}
		}
		return count;
	}
	
}
