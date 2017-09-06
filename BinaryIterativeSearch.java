package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "BinaryIterativeSearch";
	}

	@Override
	public int search(int[] arr, int target) {

		int min = 0;
		int max = arr.length - 1;

		while (min <= max) {
			int mid = (min + max) / 2;

			if (target < arr[mid]) {
				max = mid - 1;
			}

			if (target > arr[mid]) {
				min = mid + 1;
			}

			else if (target == arr[mid]) {
				return mid;

			}

		}
		return -1;

	}

}
