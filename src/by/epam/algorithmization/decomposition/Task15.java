package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 15: Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность 
 * (например, 1234, 5789). 
 * Для решения задачи использовать декомпозицию.
 */

public class Task15 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ascendingSequenceSerch();
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

	public static void ascendingSequenceSerch() {

		int nDigitNumber;
		int index;

		nDigitNumber = inputNumber("Введите n-значное число (2 и более) >>");
		index = largestNumber(nDigitNumber);

		for (int number = (index / 10); number < index; number++) {

			if (ascendingSequence(number, nDigitNumber) == true) {
				outputText(number);
			}
		}
	}

	public static int largestNumber(int nDigitNumber) {

		nDigitNumber = (int) Math.pow(10, nDigitNumber);

		return nDigitNumber;
	}

	public static boolean ascendingSequence(int number, int nDigitNumber) {

		int boxOne;
		int boxTwo;

		boxOne = 0;
		boxTwo = 0;

		for (int i = 1; i < nDigitNumber; i++) {
			boxOne = number % 10;
			number /= 10;
			boxTwo = number % 10;

			if (boxOne != boxTwo + 1) {
				break;
			}

			if (i == nDigitNumber - 1) {
				return true;
			}
		}
		return false;
	}

	public static void outputText(int number) {
		System.out.println(number);
	}
}
