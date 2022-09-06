package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 5: Составить программу, которая в массиве A[N] находит второе по величине число 
 * (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task5 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ArrayLenght;
		int secondLargest;

		int array[];

		ArrayLenght = inputArrayLenght("Введите длину массива (от 2 и более) >>");

		array = new int[ArrayLenght];

		initializeArrayValues(array);
		secondLargest = secondLargestNumber(array);

		System.out.println("Второе по размеру число >>" + secondLargest);
	}

	public static int secondLargestNumber(int array[]) {

		int firstLargest;
		int secondLargest;

		firstLargest = 0;
		secondLargest = 0;

		for (int i = 0; i < array.length; i++) {

			if (i == 0) {
				firstLargest = array[i];
				secondLargest = array[i];
			}

			if ((array[i] < firstLargest) && (array[i] > secondLargest)) {
				secondLargest = array[i];

			} else if (array[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = array[i];
			}

		}

		return secondLargest;
	}

	public static int inputArrayLenght(String text) {

		int value;

		do {
			System.out.print(text);

			while (!scan.hasNextInt()) {
				System.out.print(text);
				scan.nextLine();
			}

			value = scan.nextInt();
		} while (value < 2);

		return value;
	}

	public static int inputArrayValues(String text) {

		int value;

		System.out.print(text);

		while (!scan.hasNextInt()) {

			System.out.print(text);
			scan.nextLine();
		}
		value = scan.nextInt();

		return value;
	}

	public static int[] initializeArrayValues(int array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] = inputArrayValues("Введите array [" + (i + 1) + "] >>");
		}
		return array;
	}
}
