package com.home.edu.codility.lesson4;

public class FrogRiverOne {

	public static void main(String[] args) {
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		System.out.print(solution(5, A));		
	}
	
	public static int solution(int X, int[] A) {
		int size = A.length;
		if (size == 0) {
			return -1;
		}		
		if (size < X) {
			return -1;
		}
		int[] B = new int[X];
		int count = X;
		for (int i=0; i<size; i++) {
			if (++B[A[i]-1] == 1) {
				count--;
			}
			if (count == 0) {
				return i;
			}
		}
		return -1;
	}
	
}
