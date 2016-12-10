package com.home.edu.codility.lesson4;

public class MaxCounters {

	public static void main(String[] args) {
		int[] A = {3,4,4,6,1,4,4};
		//int[] A = {1,1,1,1,7};
		int[] R = solution(5, A);
		for (int r : R) {
			System.out.print(r);
		}
	}
	
	public static int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int maxCounter = 0;
		int lastMaxCounter = 0;
		for (int a : A) {
			if (a <= N) {
				if (counters[a-1] < lastMaxCounter) {
					counters[a-1] = lastMaxCounter;
				}				
				if (++counters[a-1] > maxCounter) {
					maxCounter = counters[a-1]; 
				}				
			} else if (a == N + 1) {
				lastMaxCounter = maxCounter; 
			}
		}
		for(int i=0; i<N; i++) {
			if (counters[i] < lastMaxCounter) {
				counters[i] = lastMaxCounter;
			}				
		}
		return counters;
	}
	
}
