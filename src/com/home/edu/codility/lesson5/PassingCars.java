package com.home.edu.codility.lesson5;

public class PassingCars {

	public static void main(String[] args) {
		int[] A = {0, 1, 0, 1, 1};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {
		int carPairNumber = 0; 
		int size = A.length;
		if (size == 0) {
			return 0;
		}		
		int[] westCarPrefixCount = new int[size];
		
		westCarPrefixCount[0] = A[0];  
		for (int i=1;i<size;i++) {			
			westCarPrefixCount[i] = westCarPrefixCount[i-1] + A[i];			
		}
		
		for(int i=0;i<size;i++) {
			if (A[i] == 0) {
				carPairNumber += westCarPrefixCount[size-1] - westCarPrefixCount[i];  
			}
			if(carPairNumber > 1000000000) {
				return -1;
			}
		}
		
		return carPairNumber;
	}
	
}
