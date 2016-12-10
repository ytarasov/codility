package com.home.edu.codility.lesson7;

import java.util.Stack;

public class Fish {

	public static void main(String[] args) {		
		//int[] A = {4, 3, 2, 1, 5};
		//int[] B = {0, 1, 0, 0, 0};
		int[] A = {4, 2, 3, 1, 5};
		int[] B = {0, 1, 0, 0, 1};
		System.out.print(solution(A, B));		
	}
	
	public static int solution(int[] A, int[] B) {
		int N = A.length;
		Stack<Integer> upstreamFishes = new Stack<Integer>();
		Stack<Integer> downstreamFishes = new Stack<Integer>();		
		for (int i=0; i<N; i++) {
			int upstreamFishSize = A[i];
			if (i!=0 && (B[i-1] == 1 && B[i]==0)) {				
				int downstreamFishSize = 0;
				boolean isDownstreamGreaterUpstreamFish = false;
				do {
					downstreamFishSize = downstreamFishes.pop();
					isDownstreamGreaterUpstreamFish = downstreamFishSize > upstreamFishSize;
				} while (!isDownstreamGreaterUpstreamFish && !downstreamFishes.isEmpty());				
				if (isDownstreamGreaterUpstreamFish) {
					downstreamFishes.push(downstreamFishSize);
					B[i] = 1;
					continue;
				}			
			}
			if (B[i] == 0) {				
				upstreamFishes.push(upstreamFishSize);				
			} else {				
				downstreamFishes.push(upstreamFishSize);
			}			
		}
		return upstreamFishes.size() + downstreamFishes.size();
	}
	
}
