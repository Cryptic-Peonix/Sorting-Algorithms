package main.objects;

/*
 * Created by Connor Clark
 * Done Honestly
 */
public class SelectionSorter {

	// Array to be sorted
	private int a[];

	/**
	 * Construct a selection sorter
	 * 
	 * @param array the array to sort
	 */
	public SelectionSorter(int[] array) {
		a = array;
	}

	/**
	 * Sorts the desired array
	 */
	public void sort() {
		for (int i = 0; i < a.length - 1; i++) {
			int minPos = minimumPosition(i);
			swap(minPos, i);
		}
	}

	/**
	 * Finds the smallest value in the list from the current position
	 * 
	 * @param from the current position
	 * @return the smallest value found
	 */
	private int minimumPosition(int from) {
		int minPos = from;
		for (int i = from + 1; i < a.length; i++) {
			if (a[i] < a[minPos]) {
				minPos = i;
			}
		}
		return minPos;
	}

	/**
	 * Swaps with element at "i" with the element at "j"
	 * 
	 * @param i The int to swap
	 * @param j the int getting swapped
	 */
	private void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
