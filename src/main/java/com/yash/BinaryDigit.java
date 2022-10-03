package com.yash;

public class BinaryDigit {

	public String BinaryDigit(int num) {

		int temp = num;
		String binary = "";
		while (num > 0) {
			int rem = num % 2;
			binary = rem + binary;
			num = num / 2;
		}
		return binary;
	}

}
