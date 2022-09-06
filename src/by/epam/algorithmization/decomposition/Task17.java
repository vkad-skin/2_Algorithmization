package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 17: Из заданного числа вычли сумму его цифр. 
 * Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? 
 * Для решения задачи использовать декомпозицию.
 */

public class Task17 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subtractingNumber();
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

	public static void subtractingNumber() {

		int number;
		int count;
		int box;

		count = 0;

		number = inputNumber("Введите число (от 1 и более) >>");
		box = number;

		while (box != 0) {
			box -= subtractingSumDigit(box);
			count++;
		}
		outputText(count, number, box);
	}

	public static int subtractingSumDigit(int number) {

		int sum;

		sum = 0;

		do {
			sum = sum + number % 10;
			number /= 10;

		} while (number != 0);

		return sum;
	}

	public static void outputText(int count, int number, int box) {
		System.out
				.println("Для числа " + number + " нунжо произвести " + count + " дейсвий для получения " + box + ".");
	}
}
