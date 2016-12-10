package com.home.edu.codility.lesson8;

public class Dominator {

	public static void main(String[] args) {		
		int[] A = {8, 4, 6};
		//int[] A = {3, 4, 3, 5, 3, 3, 3, 3, 3};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {
		int N = A.length;		
		int size = 0;
		int value = 0;		
		for(int i=0; i<N; i++) {
			if(size == 0) {
				value = A[i];
				size++;
			} else {
				if (A[i] != value) {
					size--;
				} else {
					size++;
				}
			}
		}
		
		int count = 0;
		if (size <= 0) {
			return -1;
		}		
		for(int i=0; i<N; i++) {
			if (A[i] == value) {
				count++;
				if (count > (N/2)) {
					return i;
				}
			}			
		}
		
		return -1;
	}
	
}
