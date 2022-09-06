package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 10: Дано натуральное число N. Написать метод(методы) для формирования массива, 
 * элементами которого являются цифры числа N.
 */

public class Task10 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[];

		int number;

		number = inputNumber("Ввидите число (от 10 и больше) >>");

		array = new int[sizeArray(number)];

		initializeArrayValues(array, number);
		outputArray(array, number);

	}

	public static int inputNumber(String text) {

		int value;

		do {
			System.out.print(text);

			while (!scan.hasNextInt()) {
				System.out.print(text);
				scan.nextLine();
			}

			value = scan.nextInt();
		} while (value < 10);

		return value;
	}

	public static int sizeArray(int number) {

		int size;

		size = 0;

		do {
			number = number / 10;
			size++;

		} while (number != 0);

		return size;
	}

	public static int[] initializeArrayValues(int array[], int number) {

		int value;

		for (int i = 0; i < array.length; i++) {
			value = number % 10;
			array[i] = value;
			number /= 10;
		}

		return array;
	}

	public static void outputArray(int array[], int number) {

		System.out.print("Массив из цифр числа (" + number + ") >>");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
