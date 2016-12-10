package com.home.edu.codility.lesson5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {

	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};		
		int[] result = solution(S, P, Q);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	static Map<Character, Integer> nucleotidesMap = new HashMap<Character, Integer>() {
		{
			put('A', 1);
			put('C', 2);
			put('G', 3);
			put('T', 4);
		}
	};
	
	public static int[] solution(String S, int[] P, int[] Q) {		 
		int M = P.length;
		int[] result = new int[M];		
		int[][] dnkImpactFactors = convertToDnkImpactFactors(S);		
		int[] temp = {2,4,1,5,3};		
		for (int i=0; i<M; i++) {			
			result[i] = dnkImpactFactors[P[i]][Q[i]];	
		}		
		return result;
	}
	
	private static int[][] convertToDnkImpactFactors(String S) {
		int N = S.length();
		int[][] dnkImpactFactors = new int[N][N];		
		char[] dnk = S.toCharArray();
		dnkImpactFactors[0][0] = dnk[0]; 
		for(int i=1; i<N; i++) {			
			int impactNumber = nucleotidesMap.get(dnk[i]);
			for (int j=0; j<=i; j++) {
				if (impactNumber < dnkImpactFactors[i-1][j]) {
					dnkImpactFactors[i][j] = impactNumber; 
				}
			}			 
		}
		for(int i=0; i<dnkImpactFactors.length; i++) {
			for (int j=0; j<dnkImpactFactors.length; j++) {
				System.out.print(dnkImpactFactors[i][j] + " ");
			}
			System.out.println();
		}
		return dnkImpactFactors;
	}
	
}
