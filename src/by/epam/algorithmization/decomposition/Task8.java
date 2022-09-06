package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 8: Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива 
 * с номерами от k до m.
 */

public class Task8 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[];

		int arrayLenght;
		int elementIndex;

		arrayLenght = inputArrayLenght("Введите размер массива D (от 2 и более) >>");
		elementIndex = inputElementIndex("Введите индекс массива (от 1 до " + arrayLenght + ") >>", arrayLenght) - 1;

		array = new int[arrayLenght];

		initializeArrayValues(array);
		sumThreeElements(array, elementIndex);
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

	public static int inputElementIndex(String text, int arrayLenght) {

		int value;

		do {
			System.out.print(text);

			while (!scan.hasNextInt()) {
				System.out.print(text);
				scan.nextLine();
			}

			value = scan.nextInt();
		} while (value < 1 || value > arrayLenght);

		return value;
	}

	public static int[] initializeArrayValues(int array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (100 * Math.random());
		}
		return array;
	}

	public static int sumThreeElements(int array[], int elementIndex) {

		int sum;

		sum = 0;

		if ((elementIndex + 2) < array.length) {
			System.out.print("Сумма трех значений массива [");

			for (int i = elementIndex; i <= (elementIndex + 2); i++) {
				sum += array[i];

				if (i == (elementIndex + 2)) {
					System.out.print((i + 1));

				} else {
					System.out.print((i + 1) + " ");
				}
			}
			System.out.print("] равна >>" + sum);

		} else {
			System.out.print("Сумму трех элементтов найти невозможно! Выбраный элемент [" + (elementIndex + 1)
					+ "] не подходит, размер массива [" + array.length + "]/");
			System.out.print("\nСумма значений массива [");

			for (int i = elementIndex; i < array.length; i++) {
				sum += array[i];

				if (i == (array.length - 1)) {
					System.out.print((i + 1));

				} else {
					System.out.print((i + 1) + " ");
				}
			}
			System.out.print("] равна >>" + sum);
		}

		return sum;
	}

}
