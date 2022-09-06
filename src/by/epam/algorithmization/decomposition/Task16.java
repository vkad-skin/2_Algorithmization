package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 16: Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
 * Определить также, сколько четных цифр в найденной сумме. 
 * Для решения задачи использовать декомпозицию.
 */

public class Task16 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumOddNumber();
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

	public static void sumOddNumber() {

		int nDigitNumber;
		int index;
		int sum;

		sum = 0;

		nDigitNumber = inputNumber("Введите n-значное число (1 и более) >>");
		index = largestNumber(nDigitNumber);

		for (int number = (index / 10 + 1); number < index; number += 2) {

			if (oddNamber(number, nDigitNumber) == true) {
				sum += number;
			}
		}
		outputText(evenNumber(sum), sum);
	}

	public static int largestNumber(int nDigitNumber) {

		nDigitNumber = (int) Math.pow(10, nDigitNumber);

		return nDigitNumber;
	}

	public static boolean oddNamber(int number, int nDigitNumber) {

		int box;

		for (int i = 1; i < nDigitNumber; i++) {
			number /= 10;
			box = number % 10;

			if ((box % 2) == 0 || box == 0) {
				return false;
			}
		}
		return true;
	}

	public static int evenNumber(int sum) {

		int count;
		int box;

		count = 0;

		while (sum != 0) {
			box = sum % 10;

			if ((box % 2 == 0) && (box != 0)) {
				count++;
			}
			sum /= 10;
		}
		return count;
	}

	public static void outputText(int count, int sum) {

		System.out.println("Cумма чисел состоящие из нечетных цифр равна >> " + sum);
		System.out.println("Количество четных цифр в сумме равна >> " + count);
	}
}
