package main.objects;

import java.util.Random;
import java.util.Scanner;


/**
 * Done Honestly
 * @author Connor Clark
 */
public class ArrayUtil {

	//Create new random
	private static Random GEN = new Random();
	
	/**
	 * Creates an array of size "length" and randomly generates integers
	 * @param length the size of the array
	 * @param n bounds for random number
	 * @return the completed array
	 */
	public static int[] randomIntArray(int length, int n) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = GEN.nextInt(n);
		}
		return a;
	}
	
	/**
	 * creates an array of size "length" in ascending order
	 * @param length size of the array
	 * @return the completed array
	 */
	public static int[] ascendingArray(int length) {
		int[] a = new int[length];
		for (int arrayPos = 0; arrayPos < a.length; arrayPos++) {
			a[arrayPos] = arrayPos;
		}
		return a;
	}
	
	/**
	 * creates an array of size "length" in descending order
	 * @param length size of the array
	 * @return the completed array
	 */
	public static int[] descendingArray(int length) {
		int[] a = new int[length];
		int descend = length - 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = descend;
			descend--;
		}
		return a;
	}

	/**
	 * Asks the user what type of array they would like to sort
	 * @return the Array Type selected
	 */
	public static ArrayType getArrayType() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayType type;
		while (true) {
			System.out.println("What Array Type would you like? (1 for random, 2 for ascending, 3 for descending)");
			String typeInput = scan.nextLine();
			if (typeInput.equalsIgnoreCase("random") || typeInput.equals("1")) {
				type = ArrayType.RANDOM;
				break;
			} else if (typeInput.equalsIgnoreCase("ascending") || typeInput.equals("2")) {
				type = ArrayType.ASCEND;
				break;
			} else if (typeInput.equalsIgnoreCase("descending") || typeInput.equals("3")) {
				type = ArrayType.DESCEND;
				break;
			} else {
				System.err.println("Invalid input! Please try again!");
				continue;
			}
		}
		return type;
	}
	
	/**
	 * Creates an array given the values inputted
	 * @param type the Array Type (random, ascending, etc)
	 * @param length the length of the array
	 * @param range the range of array values (used for random only)
	 * @return the completed array
	 */
	public static int[] createArray(ArrayType type, int length, int range) {
		int[] a;
		switch (type) {
		case RANDOM:
			a = ArrayUtil.randomIntArray(length, range);
			break;
		case ASCEND:
			a = ArrayUtil.ascendingArray(length);
			break;
		case DESCEND:
			a = ArrayUtil.descendingArray(length);
			break;
		default:
			System.err.println("Invalid Array Type! Defaulting to random");
			a = ArrayUtil.randomIntArray(length, range);
		}	
		return a;
	}
	
	/**
	 * A simple enum for Array Types
	 * @author Connor Clark
	 *
	 */
	public enum ArrayType {
		RANDOM, ASCEND, DESCEND
	}
}
