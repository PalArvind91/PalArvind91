package com.yash;

public class EvenOddCount {
	
	public String evenAndOddCount(int num) {
		
		String evenodd = "";
		int evenCount =0;
		int oddCount =0;
		while(num>0) {
			
			int rem = num %10;
			if(rem %2 ==0)
				evenCount++;
			else 
				oddCount++;
			num = num/10;
		}
		return evenodd+evenCount+" even digits and "+oddCount+" odd digits";
	}
	

}
