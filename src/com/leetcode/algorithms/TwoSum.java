package com.leetcode.algorithms;

import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	// Brute Force:

	// O(n^2)

	private static int[] bruteForceTwoSum(int[] nums, int target) {
		try {
			for (int i = 0; i < nums.length; i++) {
				int check = target - nums[i];
				for (int j = 0; j < nums.length; j++) {
					if (i == j) {
						continue;
					} else if (nums[j] == check) {
						return new int[] { i, j };
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Error:" + e.toString());
		}

		return new int[] {};
	}

	// Less Time Complex function using Hash Table.

	// O(n)

	private static int[] twoSum(int[] nums, int target) {

		try {
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < nums.length; i++) {
				int check = target - nums[i];
				if (map.containsKey(check)) {
					return new int[] { map.get(check), i };
				}
				map.put(nums[i], i);
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}

		return new int[] {};
	}
	
	public static int[] twoSum2(int[] nums, int target) {
	       HashMap<Integer, Integer> map = new HashMap<>();
				for (int i = 0; i < nums.length; i++) {
					int check = target - nums[i];
					if (map.containsKey(check)) {
						return new int[] { map.get(check), i };
					}
					map.put(nums[i], i);
				}
	        return new int[] {};
	}

	public static void main(String[] args) {
		for (int i : bruteForceTwoSum(new int[] { 2, 7, 11, 15 }, 9)) {
			System.out.println(i);
		}
		for (int i : twoSum(new int[] { 2, 7, 11, 15 }, 9)) {
			System.out.println(i);
		}
		for (int i : twoSum2(new int[] { 2, 7, 11, 15 }, 9)) {
			System.out.println(i);
		}
	}
	

}
