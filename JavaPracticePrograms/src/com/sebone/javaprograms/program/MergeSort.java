package com.sebone.javaprograms.program;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
	
	public ArrayList<Integer> mergeSortArray(ArrayList<Integer> nums, int left, int right){
		
		try {
			nums.size();
		}catch(NullPointerException e) {
			e.printStackTrace();
			return null;
		}
		
		if(left == right) {
			return new ArrayList<Integer>( Arrays.asList(nums.get(right)));
		}
		
		int mid = (left + right) / 2;
		
		return mergerTwoArrayList(mergeSortArray(nums, left, mid), mergeSortArray(nums, mid + 1, right));
	}
	
	private ArrayList<Integer> mergerTwoArrayList(ArrayList<Integer> nums1, ArrayList<Integer> nums2){
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		
		int iterator1 = 0;
		int iterator2 = 0;
		
		while(iterator1 < nums1.size() && iterator2 < nums2.size()) {
			if(nums1.get(iterator1) < nums2.get(iterator2)) {
				sortedList.add(nums1.get(iterator1));
				iterator1++;
			}
			else {
				sortedList.add(nums2.get(iterator2));
				iterator2++;
			}
		}
		
		while(iterator1 < nums1.size()) {
			sortedList.add(nums1.get(iterator1));
			iterator1++;
		}
		
		while(iterator2 < nums2.size()) {
			sortedList.add(nums2.get(iterator2));
			iterator2++;
		}
		
		return sortedList;
	}
}
