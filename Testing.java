package kal_academy;

import java.util.Stack;

public class Testing {
	public static void main(String[] args){
		Stack<Character> stack = new Stack<>();
		String exp = "(a]]le";
		String exp1 = "–2*(3 + 5(sasdfasdfasd)";
		char first = 'a';
		char second = 'a';
		if (exp.charAt(3) == exp.charAt(2))
			System.out.println("equal");
		else
			System.out.println(exp.charAt(0) + "not equal");
		for (int i = 0; i < exp1.length(); i++) {
			//System.out.println(exp1.charAt(i));
			if(exp1.charAt(i) == '(')
				stack.push(exp1.charAt(i));
			

		}
		
		System.out.println(stack.size());

	}

}
