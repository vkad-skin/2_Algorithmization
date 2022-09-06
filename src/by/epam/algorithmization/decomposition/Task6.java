package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 6: Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task6 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber;
		int secondNumber;
		int trirdNumber;

		boolean primeNumber;

		firstNumber = inputNumber("Введите первое число (от 2 и более) >>");
		secondNumber = inputNumber("Введите второе число (от 2 и более) >>");
		trirdNumber = inputNumber("Введите третье число (от 2 и более) >>");

		primeNumber = relativelyPrimeNumber(firstNumber, secondNumber, trirdNumber);

		System.out.println("Числа " + firstNumber + ", " + secondNumber + ", " + trirdNumber + " взаимно простые? >>"
				+ primeNumber);
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

	public static boolean relativelyPrimeNumber(int firstNumber, int secondNumber, int trirdNumber) {

		if ((NOD(firstNumber, secondNumber) == 1) && (NOD(firstNumber, trirdNumber) == 1)
				&& (NOD(secondNumber, trirdNumber) == 1)) {
			return true;

		} else {
			return false;
		}
	}

	public static int NOD(int firstNumber, int secondNumber) {

		return secondNumber == 0 ? firstNumber : NOD(secondNumber, firstNumber % secondNumber);
	}
}
