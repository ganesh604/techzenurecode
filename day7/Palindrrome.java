package com.techzenure.day7;
public class Palindrrome {
	
		public boolean isPalindrome(String str) {
		/*
			int start = 0;
			int end = str.length()-1;
			while(start < end) {
				if(str.charAt(start) != str.charAt(end))
				  return false;
				
				 start++;
				 end--;			
			}
			return true;
			*/
			
			String revStr = "";
			
			for(int i=str.length()-1;i>=0;i--) {
				
				revStr += str.charAt(i);
				
			}
			
			
			return str.equalsIgnoreCase(revStr);
			
		}
	}