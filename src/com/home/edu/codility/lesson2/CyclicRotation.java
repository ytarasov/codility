package com.home.edu.codility.lesson2;

public class CyclicRotation {
	
	public static void main(String[] args) {
		int[] A = {3, 8, 9, 7, 6};
		
		int[] result = solution(A, 3);		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] solution(int[] A, int K) {		
		if (K < 0 && K > 100) {
			return A;
		}
		int size = A.length;
		if (size < 0 && size > 100) {
			return A;
		}
		int[] R = new int[size];		
		for(int i=0; i<size; i++) {
			R[getRotatedIndex(i, K, size)] = A[i]; 
		}
		return R;
	}

	private static int getRotatedIndex(int i, int K, int size) {
		if ((i + K) >= size) {
			return (i + K) % size; 
		}
		return i + K;
	}
}
