package main.objects;

import java.util.Scanner;

/**
 * Util Class for sorters. Done honestly.
 * @author Connor Clark
 * 
 */
public class SorterUtil {

	/**
	 * Ask the user what sorter they would like to use
	 * @return The sorter selected
	 */
	public static SorterType SorterSelect() {
		@SuppressWarnings("resource")
		Scanner sortScan = new Scanner(System.in);
		SorterType type;
		while (true) {
			System.out.println("What Sorter would you like to use? (1 for select, 2 for insert, 3 for java built-in)");
			String typeInput = sortScan.nextLine();
			if (typeInput.equalsIgnoreCase("select") || typeInput.equals("1")) {
				type = SorterType.SELECT;
				break;
			} else if (typeInput.equalsIgnoreCase("insert") || typeInput.equals("2")) {
				type = SorterType.INSERT;
				break;
			} else if (typeInput.equalsIgnoreCase("built-in") || typeInput.equals("3")) {
				type = SorterType.SORT;
				break;
			} else {
				System.err.println("Invalid input! Please try again!");
				continue;
			}
		}
		return type;
	}
	
	/**
	 * Enum to contian Sorter Types
	 * @author Connor Clark
	 *
	 */
	public enum SorterType {
		SELECT, INSERT, SORT
	}
	
}
