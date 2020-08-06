package com.lti.Codility;

import java.util.Stack;

public class Nesting {
	public int solution(String S) 
	{
		        Stack<Character> stack = new Stack<Character>();
		        for(char c : S.toCharArray()) 
		        {
		            if( c == '(')
		            {
		                stack.push(c);
		                }
		            //else if(c == '}')
		            //{
		                //if(stack.isEmpty() || stack.pop() != '{')
		                    //return 0;
		                //}
		            //else if(c == ']')
		           // {
		               /// if(stack.isEmpty() || stack.pop() != '[')
		                    //return 0;
		                //}
		            else if(c == ')') 
		            {
		                if(stack.isEmpty() || stack.pop() != '(')
		                    return 0;
		               }
		        }
		        return stack.isEmpty() ? 1 : 0;
		    }
	 public static void main(String[] args)
	    {
	        System.out.println(new Nesting().solution("()()()"));
	        System.out.println(new Nesting().solution("(())"));    
	    }
	
		    

}
