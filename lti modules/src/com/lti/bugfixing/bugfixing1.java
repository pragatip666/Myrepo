package com.lti.bugfixing;

public class bugfixing1 {
	//public class BugFixing1 {

		 //return the character that occurs the most frequently in the given string
	    //in case of more than one character satisfying the requirement, we need to
	    //return the earliest character alphabetically
	    String solution(String S) {
	        int[] occurrences = new int[26];
	        for (char ch : S.toCharArray()) {
	            occurrences[ch - 'a']++;
	        }
	        char best_char = 'a';
	        int best_res = 0;
	        for (int i = 0; i <26; i++) {
	            if (occurrences[i] > best_res) {
	                best_char = (char) ((int) 'a' + i);
	                best_res = occurrences[i];
	            }
	        }

	 

	        return Character.toString(best_char);
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(new bugfixing1().solution("apple"));
	    	System.out.println(new bugfixing1().solution("hello"));
	    	System.out.println(new bugfixing1().solution("parameter"));
	    	System.out.println(new bugfixing1().solution("madam"));
	    	
	    }
	}


//}
