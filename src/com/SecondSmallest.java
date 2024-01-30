package com;

public class SecondSmallest {
	public static int findSmallestElement(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while(left<right) {
			int mid = left + (right-left)/2;
			if(nums[mid]>nums[right]) {
				left = mid+1;
				
			}
			else {
				right = mid;
			}
		}
		if(left<nums.length-1) {
			System.out.println(""+nums[left+1]);
		} else {
			System.out.println(""+nums[0]);
		}

		return nums[left];
	}

	public static void main(String[] args) {
		int[] rotatedArray = { 4, 5, 6, 7, 0, 1 };

		int result = findSmallestElement(rotatedArray);

		System.out.println("Smallest element in the sorted rotated array: " + result);
	}
}