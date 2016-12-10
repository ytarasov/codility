package com.home.edu.codility.lesson7;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {		
		//String S = "{[()()]}";
		//String S = "([)()]";
		String S = ")(";
		System.out.print(solution(S));		
	}
	
	public static int solution(String S) {
		Stack<Character> myStack = new Stack<Character>();
		String B = "{}[]()";
		char[] brackets = B.toCharArray();		
		for (char a : S.toCharArray()) {
			int pos = B.indexOf(a);
			if (pos % 2 == 0) {
				myStack.push(a);
			} else {
				if (myStack.isEmpty()) {
					return 0;
				}
				char b = myStack.pop();
				if (b != brackets[pos - 1]) {
					return 0;
				}
			}
		}
		if (!myStack.isEmpty()) {
			return 0;
		}
		return 1;
	}
	
}
