package com.home.edu.codility.lesson1;

public class BinaryGap {
	
	public static void main(String[] args) {
		int N = 15;
		System.out.println(solution(N));
	}
	
	public static int solution(int N) {
		if (N < 1) {
			return 0;
		}
		String binValue = Integer.toBinaryString(N);
		int binGap = 0;
		int maxBinGap = 0;		
		for (char sym : binValue.toCharArray()) {
			if (sym == '0') {
				binGap++;
			}
			if (sym == '1') {
				if (binGap > maxBinGap) {
					maxBinGap = binGap; 
				}
				binGap = 0;
			}
		}		
		return maxBinGap;
	}
	
}
