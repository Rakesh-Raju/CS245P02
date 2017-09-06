package edu.usfca.cs.cs245;

import java.lang.reflect.Array;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "BinaryRecursiveSearch";
	}

	@Override
	public int search(int[] arr, int target) {

		return (new BinaryRecursiveSearch().searchRec(arr, target, 0, arr.length - 1));

	}

	public int searchRec(int[] arr, int target, int min, int max) {
		if (max < min) {
			return -1;
		}
		int mid = (min + max) / 2;
		if (arr[mid] == target) {
			return mid;
		}

		if (arr[mid] > target) {

			return searchRec(arr, target, min, mid - 1);
		}

		else {

			return searchRec(arr, target, mid + 1, max);
		}
	}
}
