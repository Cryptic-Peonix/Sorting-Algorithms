package main.objects;

public class InsertionSorter {

	// Array to be sorted
	private int a[];

	public InsertionSorter(int[] array) {
		a = array;
	}

	/**
	 * Sorts the desired array. Checks the value of the number behind the current
	 * index position to see if the current number is smaller. If it is, it checks
	 * all of the numbers behind until it finds a number larger than itself (or
	 * reaches index position 0). The number is stored in a temp variable "current",
	 * everything else is shifted up one, and "current" is slotted into the correct
	 * position
	 */
	public void sort() {
		int j;
		for (int i = 1; i < a.length; i++) {
			int current = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > current) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = current;
		}
	}

}
