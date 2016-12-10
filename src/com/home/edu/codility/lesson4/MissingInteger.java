package com.home.edu.codility.lesson4;
import java.util.Arrays;

public class MissingInteger {
	
	public static void main(String[] args) {
		int[] A = {2, 3, 4, 5};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {
        int size = A.length;
        if (size == 0) {
            return 1;
        }
        if (size == 1) {
        	if (A[0] == 1) {
        		return 2;
        	} else {
        		return 1;
        	}
        }
        Arrays.sort(A);
        if (A[0] > 1) {
        	return 1;
        }
        for(int i=1; i<size; i++) {
        	if (A[i-1] <= 0 && A[i] > 1) {
        		return 1;
        	}
        	if ((A[i-1]>0) && ((A[i]-A[i-1]) > 1)) {        		            	
                return A[i-1] + 1;
        	}            
        }
        if (A[size-1] <= 0) {
        	return 1;
        }
        if (A[size-1] == Integer.MAX_VALUE) {
        	return Integer.MAX_VALUE;
        }
        return A[size-1] + 1;
    }
	
}
