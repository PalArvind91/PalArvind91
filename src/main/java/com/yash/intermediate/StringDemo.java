package com.yash.intermediate;

public class StringDemo {
	
	public int StringLength(String str) {
		int i=0;
		for(char ch : str.toCharArray()) {
			i++;
		}
		return i;
	}
	
	

	public String StringConcate(String str1, String str2) {
		
		return str1+" "+str2;
	}

}
