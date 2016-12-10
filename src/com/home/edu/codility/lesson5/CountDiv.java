package com.home.edu.codility.lesson5;

public class CountDiv {

	public static void main(String[] args) {
		int A = 0;
		int B = 14;
		int K = 2;
		System.out.print(solution(A,B,K));		
	}
	
	public static int solution(int A, int B, int K) {		
		int divCount = B / K - A / K;		
		if ((A % K) == 0 || (B % K) == 0) {
			divCount++;
		} 
		return divCount;
	}
	
}
