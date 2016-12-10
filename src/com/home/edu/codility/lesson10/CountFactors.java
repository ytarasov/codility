package com.home.edu.codility.lesson10;

public class CountFactors {

	public static void main(String[] args) {		
		System.out.print(solution(24));		
	}
	
	public static int solution(int N) {
		int n = 0;
		int size = (int) Math.sqrt(N);
		int a = N / size;
		int b = N % size;
		if (a == size && b == 0) {
			n--;			
		}
		for(int i=1; i<=size; i++) {
			if ((N % i) == 0) {
				n+=2;
			}
		}
		return n;
	}
	
}
