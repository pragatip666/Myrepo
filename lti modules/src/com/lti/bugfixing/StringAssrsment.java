package com.lti.bugfixing;

public class StringAssrsment {
	      public int solution(String S, int K) 
	      {
				String str[] = S.split(" ");
				int count = 0;
				int len = str.length;
				
				int Foundstr = 1;
				for (int i = 0; i < len; i++)
				{
					if(str[i].length() > K)
						return -1;
					count += str[i].length();
					if(count >= K) {
						Foundstr++;
						count = str[i].length();
					}
				}
				return Foundstr;
			}
			
			public static void main(String[] args) 
			{
				
				System.out.println(new StringAssrsment().solution("SMS messages are really short", 12));
			}
		}
	
