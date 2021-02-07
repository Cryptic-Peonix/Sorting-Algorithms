package main;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import main.objects.ArrayUtil;
import main.objects.SelectionSorter;

/*
 * Created By Connor Clark
 * Done Honestly
 */
public class SelectionSortDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numElements;
		int maxRange;

		/*
		 * Loop to get the size of the array
		 * Uses try/catch to ensure the value entered is an int value
		 */
		while (true) {
			try {
				System.out.println("How many elements?");
				numElements = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer value!" + "\n");
				scan.next();
			}
		}

		/*
		 * Loop to get the max number range
		 * uses try/catch to ensure the value entered is an int
		 */
		while (true) {
			try {
				System.out.println("Max range of element vlaues?");
				maxRange = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer value!" + "\n");
				scan.next();
			}
		}

		// create the new array
		int[] a = ArrayUtil.randomIntArray(numElements, maxRange);

		// Print array before sort
		System.out.println("before sort" + Arrays.toString(a));

		// Sort the Array
		SelectionSorter sorter = new SelectionSorter(a);
		sorter.sort();

		// Print array After sort
		System.out.println("after sort:" + Arrays.toString(a));

		// Close scanner
		scan.close();

	}
}
