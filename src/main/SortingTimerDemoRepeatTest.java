package main;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import main.objects.ArrayUtil;
import main.objects.ArrayUtil.ArrayType;
import main.objects.InsertionSorter;
import main.objects.SelectionSorter;
import main.objects.SorterUtil;
import main.objects.SorterUtil.SorterType;
import main.objects.StopWatch;

/**
 * Created By Connor Clark. Done Honestly
 */
public class SortingTimerDemoRepeatTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Times to repeat test: ");
		int testR = scan.nextInt();

		int numElements;
		int maxRange;

		/*
		 * Loop to get the size of the array Uses try/catch to ensure the value entered
		 * is an int value
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
		 * Loop to get the max number range uses try/catch to ensure the value entered
		 * is an int
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
		ArrayType arrayType = ArrayUtil.getArrayType();

		// ask user sorter type
		SorterType sortType = SorterUtil.SorterSelect();

		// Create timer
		StopWatch timer = new StopWatch();

		for (int k = 1; k <= testR; k++) {
			
			int[] a = ArrayUtil.createArray(arrayType, numElements, maxRange);
			
			System.out.println("Trial " + k);

			// Print array before sort
			//System.out.println("before sort" + Arrays.toString(a));

			// Create sorters and run them
			switch (sortType) {
			case SELECT:
				SelectionSorter sSorter = new SelectionSorter(a);
				timer.start();
				sSorter.sort();
				timer.stop();
				break;
			case INSERT:
				InsertionSorter iSorter = new InsertionSorter(a);
				timer.start();
				iSorter.sort();
				timer.stop();
				break;
			case SORT:
				timer.start();
				Arrays.sort(a);
				timer.stop();
			}

			// Print array After sort
			//System.out.println("after sort:" + Arrays.toString(a));

			// Print time
			System.out.println("Sort took " + timer.getElapsedTime() + " milliseconds!" + "\n");
			timer.reset();

		}
		scan.close();
	}

}
