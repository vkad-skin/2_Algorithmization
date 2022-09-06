package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 13: Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
 * Для решения задачи использовать декомпозицию.
 */

public class Task13 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sequenceNumber();
	}

	public static void sequenceNumber() {

		int numberPrime;
		int number;

		numberPrime = 0;

		number = inputNumber("Введите натуральное число (от 3 и более) >>");

		for (int i = number; i <= (number * 2); i++) {

			if ((i % 2) == 0) {
				i++;
			}

			numberPrime = primeNumberSearch(i, numberPrime);
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
		} while (value < 2);

		return value;
	}

	public static int primeNumberSearch(int indexNumber, int numberPrime) {

		if (3 == indexNumber) {
			return indexNumber;
		}

		for (int j = 3; j <= (((int) Math.sqrt(indexNumber)) + 1); j++) {

			if ((indexNumber % j) == 0) {
				break;

			} else if (((int) Math.sqrt(indexNumber) + 1 == j) && (indexNumber % j != 0)) {
				twinsNumberSearch(indexNumber, numberPrime);
				return indexNumber;
			}
		}
		return numberPrime;
	}

	public static void twinsNumberSearch(int indexNumber, int numberPrime) {

		if (numberPrime == indexNumber - 2) {

			System.out.println("Простые числа близнецы >> " + numberPrime + " и " + indexNumber);
		}
	}

}
