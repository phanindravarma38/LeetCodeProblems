package com.leetcode.algorithms;

public class ReverseInteger {

	private static int spaceComplexReverseInteger(int number) {

		boolean isNegative = number > 0 ? false : true;
		if (isNegative) {
			number = number * -1;
		}
		char[] charArray = String.valueOf(number).toCharArray();
		char[] resultArray = new char[charArray.length];

		for (int i = 0; i < charArray.length; i++) {
			resultArray[resultArray.length - i - 1] = charArray[i];

		}

		int resultNumber = 0;
		try {
			resultNumber = Integer.parseInt(String.valueOf(resultArray));
		} catch (Exception e) {
			resultNumber = 0;
		}

		if (isNegative) {
			resultNumber *= -1;
		}
		return resultNumber;
	}

	private static int reverseInteger(int number) {

		boolean isNegative = number > 0 ? false : true;

		if (isNegative)
			number *= -1;
		int lastDigit = 0;
		int reverseNumber = 0;
		while (number >= 1) {

			lastDigit = number % 10;
			if (reverseNumber * 10 > Integer.MAX_VALUE)
				return 0;
			reverseNumber = lastDigit + reverseNumber * 10;
			number = number / 10;

		}

		return isNegative ? reverseNumber * -1 : reverseNumber;

	}

	public static void main(String[] args) {
		System.out.println(spaceComplexReverseInteger(-123));

		System.out.println(123 / 10);

	}

}
