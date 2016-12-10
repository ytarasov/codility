package com.home.edu.codility.lesson7;

import java.util.Stack;

public class Nesting {

	public static void main(String[] args) {		
		//String S = "(()(())())";
		//String S = "(()())";
		String S = "(";
		System.out.print(solution(S));		
	}
	
	public static int solution(String S) {
		Stack<Character> myStack = new Stack<Character>();				
		for (char a : S.toCharArray()) {			
			if (a == '(') {
				myStack.push(a);
			} else {
				if (myStack.isEmpty()) {
					return 0;
				}
				myStack.pop();				
			}
		}
		if (!myStack.isEmpty()) {
			return 0;
		}
		return 1;
	}
	
}
