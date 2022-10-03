package com.yash;

public class MultiplyNumber {

	public int multiplyNumber(int num) {

		if (num == 0)
			return 0;

		int res = 1, sum = 0;
		int n1;
		while (num != 0) {
			n1 = num % 10;
			res = res * n1;
			num = num / 10;
		}

		return res;
	}

}
