package com.home.edu.codility.lesson3;

import java.util.Arrays;

public class PermMissingElem {
	
	public static void main(String[] args) {
		int[] A = {1,3,2,4,6};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {
		int size = A.length;
		if (size == 0) {
			return 1;
		}
		if (size == 1) {
			if (A[0] == 2) {
				return 1;
			} else if(A[0] == 1) {
				return 2;
			}
			return 1;
		}
		Arrays.sort(A);
		if (A[0] != 1) {
			return 1;
		}
		for (int i=1; i<size; i++) {
			if ((A[i] - A[i-1]) == 2) {
				return A[i]-1; 
			}
		}		
		return size + 1;
	}
	
}
