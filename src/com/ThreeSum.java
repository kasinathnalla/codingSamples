package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		List<List<Integer>> outputArray = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length - 2; i++) {

			int sum =0;
			if ((i == 0) || (nums[i] != nums[i - 1])) {
				int low = i+1;
				int high = nums.length-1;
				
				sum = sum - nums[i];
				while(low<high) {
					if(sum ==(nums[low]+nums[high])) {
						outputArray.add(Arrays.asList(nums[i], nums[low], nums[high]));
						
						while(low<high && nums[low]== nums[low+1]) low++;
						while(low<high && nums[high]== nums[high-1]) high--;
						low++;
						high --;
							
							
						
					}else if (sum<(nums[low]+nums[high])) {
						high--;
						
					} else {
						low++;
						
					}
				}

			}
		}

		return outputArray;

	}

	public static void main(String[] a) {
		System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));

	}

}
