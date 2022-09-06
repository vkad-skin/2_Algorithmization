package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 12: Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task12 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[];

		int numberK;
		int numberN;

		numberK = inputNumber("Введите натуральное число K >>");
		numberN = inputNumber("Введите натуральное число N >>");

		array = new int[arrayLenght(numberK, numberN)];

		System.out.print(array.length + "! ");

		initializeArrayValues(array, numberK, numberN);
		outputArray(array);

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
		} while (value < 2);

		return value;
	}

	public static void outputArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int sizeNumber(int number) {

		int size;

		size = 0;

		do {
			number = number / 10;
			size++;

		} while (number != 0);

		return size;
	}

	public static int arrayLenght(int numberK, int numberN) {

		int lenght;
		int sumDigit;
		int value;

		sumDigit = 0;
		lenght = 0;

		for (int i = numberK; i <= numberN; i++) {
			value = i;

			for (int j = 0; j < sizeNumber(i); j++) {
				sumDigit = sumDigit + value % 10;
				value /= 10;
			}

			if (sumDigit == numberK) {
				lenght++;
			}
			sumDigit = 0;
		}

		return lenght;
	}

	public static int[] initializeArrayValues(int array[], int numberK, int numberN) {

		int sumDigit;
		int index;
		int value;

		sumDigit = 0;
		index = 0;

		for (int i = numberK; i <= numberN; i++) {
			value = i;

			for (int j = 0; j < sizeNumber(i); j++) {
				sumDigit = sumDigit + value % 10;
				value = value / 10;
			}

			if ((sumDigit == numberK) && (index < array.length)) {
				array[index] = i;
				index++;
			}
			sumDigit = 0;
		}

		return array;
	}

}
