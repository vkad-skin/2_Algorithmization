package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 11: Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task11 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text;

		int firstNumber;
		int secondNumber;

		firstNumber = inputNumber("Введите первое число (от 1 и больше) >>");
		secondNumber = inputNumber("Введите второе число (от 1 и больше) >>");

		text = compareSizeNumber(firstNumber, secondNumber);

		System.out.print(text);
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
		} while (value < 1);

		return value;
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

	public static String compareSizeNumber(int firstNumber, int secondNumber) {

		String text;

		if (sizeNumber(firstNumber) > sizeNumber(secondNumber)) {
			text = "Число " + firstNumber + " имеет больше цифр, чем " + secondNumber + ".";

		} else if (sizeNumber(firstNumber) < sizeNumber(secondNumber)) {
			text = "Число " + secondNumber + " имеет больше цифр, чем " + firstNumber + ".";

		} else {
			text = "Числа " + firstNumber + " и " + secondNumber + " имеют одинаковое количество цифр.";
		}

		return text;

	}
}
