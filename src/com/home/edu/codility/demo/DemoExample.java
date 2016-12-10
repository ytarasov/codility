package com.home.edu.codility.demo;

public class DemoExample {

	public static void main(String[] args) {
		int[] A = {-1, 3, -4, 5, 1, -6, 2, 1};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8        
        int size = A.length;
        if (size == 0 || size > 100000) {
            return -1;
        }
        int firstPartSum = 0;
        int secondPartSum = getSum(A, 1, size);
        
        for(int i=0; i<size-1; i++) {        	
            firstPartSum = firstPartSum + A[i];
            secondPartSum = secondPartSum - A[i+1];
            if (firstPartSum == secondPartSum) {
                return i+1;    
            }
        }
        return -1;
    }
    
    public static int getSum(int[] A, int startIndex, int endIndex) {
        int sum = 0;
        for (int i=startIndex; i<endIndex; i++) {
            sum+=A[i];
        }
        return sum;
    }
	
}
