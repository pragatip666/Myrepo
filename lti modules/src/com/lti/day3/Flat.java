package com.lti.day3;

import java.util.Arrays;


class CountKSubStr 
{ 
 public static int countkDist(String str) 
    { 
       int res = 0; 
       int n = str.length(); 
        int cnt[] = new int[26]; 
        for (int i = 0; i < n; i++) 
        { 
            int dist_count = 0; 
            Arrays.fill(cnt, 0); 
            for (int j=i; j<n; j++) 
            { 
             if (cnt[str.charAt(j) - 'a'] == 0) 
                    dist_count++; 
               cnt[str.charAt(j) - 'a']++; 
               if (dist_count == 1) 
                    res++; 
            } 
        } 
  
        return res; 
    } 
public static void main(String[] args) 
    { 
        CountKSubStr ob = new CountKSubStr(); 
        String ch = "abcbaa"; 
       
        System.out.println("Total substrings with exactly " + 
                                " distinct characters : "
                           + ob.countkDist(ch)); 
    } 
  
   
} 
