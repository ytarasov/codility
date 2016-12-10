package com.home.edu.codility.lesson8;

public class EquiLeader {

	public static void main(String[] args) {		
		//int[] A = {4, 3, 4, 4, 4, 2};
		int[] A = {4, 4, 2, 5, 3, 4, 4, 4};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] A) {
		int N = A.length;
		int equiLeaderCount = 0;
		int leaderValue = getLeaderValue(A);
		int leaderValueAllCount = getAllLeaderValueNumber(A, leaderValue);		
		
		int leaderValueCount = 0; 
		for(int i=0; i<N; i++) {
			if (A[i] == leaderValue) {
				leaderValueCount++;				
			}
			if ((leaderValueCount > ((i+1)/2)) && ((leaderValueAllCount - leaderValueCount) > (N-i-1)/2)) {
				equiLeaderCount++;
			}
		}
		
		return equiLeaderCount;
	}
	
	private static int getAllLeaderValueNumber(int[] A, int leaderValue) {
		int N = A.length;
		int leaderValueCount = 0;
		for(int i=0; i<N; i++) {
			if (A[i] == leaderValue) {
				leaderValueCount++;
			}
		}
		return leaderValueCount;
	}

	private static int getLeaderValue(int[] A) {
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
		if (size <= 0) {
			return -1;
		}
		return value;
	}
	
}
