package kal_academy;

import java.util.Stack;


public class StackHomeWork {
	
	public static boolean arePair(char openingChar, char closingChar){
		if((openingChar == '[') && (closingChar == ']')||
				(openingChar == '(') && (closingChar == '(')||
				(openingChar == '{') && (closingChar == '}'))
			return true;
		else return false;
	}
	
	public static boolean areParenthesisBalanced(String exp){
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<exp.length();i++){
			char ch = exp.charAt(i);
			if(ch == '[' || ch == '(' || ch == '{')
				stack.push(ch);
			else if(ch == ']' || ch == ')' || ch == '}'){
				if(stack.isEmpty() || !arePair(stack.peek(), ch))
					return false;
				else stack.pop();
			}
		}
		return stack.isEmpty()?true:false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "–2*(3 + 5(sasdfasdfasd)";
		String one = "(testing)";
		System.out.println(one.charAt(3));
		//areParenthesisBalanced(one);
		
		if(areParenthesisBalanced(one))
			System.out.println("balanced");
		else System.out.println("Unbalanced");
			

	}

}
