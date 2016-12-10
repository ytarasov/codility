package com.home.edu.codility.lesson7;

import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {		
		//int[] A = {8, 8, 5, 7, 9, 8, 7, 4, 8};
		int[] A = {0, 0, 0, 0, 0};
		System.out.print(solution(A));		
	}
	
	public static int solution(int[] H) {
		int N = H.length;
		Stack<Integer> blockHeights = new Stack<Integer>();
		int count = 0;
		int lastHeight = 0;
		for(int i=0; i<N; i++) {
			int currentHeight = H[i];			
			if (currentHeight > lastHeight) {
				blockHeights.push(currentHeight);				
			}
			if(currentHeight < lastHeight) {				
				while(!blockHeights.isEmpty() && (lastHeight = blockHeights.pop()) > currentHeight) {					
					count++;					
				}
				if (lastHeight < currentHeight) {
					blockHeights.push(lastHeight);
				}
				blockHeights.push(currentHeight);
			}
			lastHeight = currentHeight;
		}		
		return count + blockHeights.size();
	}
	
}
