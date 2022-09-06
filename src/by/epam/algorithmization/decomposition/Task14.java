package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 14: Натуральное число, в записи которого n цифр, называется числом Армстронга, 
 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. 
 * Для решения задачи использовать декомпозицию.
 */

public class Task14 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		searchArmstrongNumber();
	}

	public static void searchArmstrongNumber() {

		int numberK;

		numberK = inputNumber("Введите число K (от 1 и более) >>");

		for (int number = 1; number <= numberK; number++) {
			armstrongNumber(number, sumDigit(number, sizeDigit(number)));
		}
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

	public static int sumDigit(int number, int size) {

		int sum;

		sum = 0;

		do {
			sum = sum + (int) Math.pow((number % 10), size);
			number /= 10;

		} while (number != 0);

		return sum;
	}

	public static int sizeDigit(int number) {

		int size;

		size = 0;

		do {
			number /= 10;
			size++;

		} while (number != 0);

		return size;
	}

	public static void armstrongNumber(int number, int sum) {

		if (number == sum) {
			outputText(number);
		}
	}

	public static void outputText(int number) {

		System.out.println("Число Амстронга >> " + number);
	}
}
