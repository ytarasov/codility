package com.home.edu.codility.lesson2;

import java.util.Arrays;

public class OddArrayElement {		

	public static void main(String[] args) {
		int[] A = {5,5,1,1,1,1,2,7,7,9,9,9};
		System.out.println(solution(A));
	}
	
	private static int solution(int[] A) {
        // write your code in Java SE 8
		int size = A.length;
		if (size == 1) {
            return A[0];
        }
		Arrays.sort(A);		
		int numOccur = 1;
		for (int i=0; i<A.length-1; i++) {
			if (A[i] == A[i+1]) {
				numOccur++;
			} else {				
				if (numOccur %2 != 0) {
					return A[i];
				}				
				numOccur = 1;
			}			
		}
		if (numOccur % 2 != 0) {
			return A[size-1]; 
		}
		return 0;
    }	 
	
}
