package by.epam.algorithmization.sorting;

import java.util.Scanner;

public class Task_1_8 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberTask;

		numberTask = -1;

		while (numberTask != 0) {

			numberTask = inputCansole();
			taskMenu(numberTask);
		}
	}

	public static String textMenu() {

		String info;

		info = "Выберете задание:\n";
		info += "Одномерные массивы. Сортировка 1-8.\n";
		info += "Выход из программы - 0.\n";
		info += ">>";

		return info;
	}

	public static void viewTextMenu() {

		System.out.print(textMenu());
	}

	public static int inputCansole() {

		int value;

		do {
			viewTextMenu();

			while (!scan.hasNextInt()) {

				viewTextMenu();
				scan.nextLine();
			}
			value = scan.nextInt();

		} while ((value < 0) || (value > 8));

		return value;
	}

	public static int inputInt(String text) {

		int value;

		System.out.print(text);

		while (!scan.hasNextInt()) {

			System.out.print(text);
			scan.nextLine();
		}
		value = scan.nextInt();

		return value;
	}

	public static int inputIntPositive(String text) {

		int value;

		do {
			System.out.print(text);

			while (!scan.hasNextInt()) {

				System.out.print(text);
				scan.nextLine();
			}
			value = scan.nextInt();

		} while (value < 0);

		return value;
	}

	public static double inputDouble(String text) {

		double value;

		System.out.print(text);

		while (!scan.hasNextDouble()) {

			System.out.print(text);
			scan.nextLine();
		}
		value = scan.nextDouble();

		return value;
	}

	public static void taskMenu(int numberTask) {

		switch (numberTask) {

		case 1:
			taskOne();
			break;

		case 2:
			taskTwo();
			break;
		case 3:
			taskThree();
			break;

		case 4:
			taskFour();
			break;

		case 5:
			taskFive();
			break;

		case 6:
			taskSix();
			break;

		case 7:
			taskSeven();
			break;
		}
	}

	public static void taskOne() {

		/*
		 * Задача 1: Заданы два одномерных массива с различным количеством элементов и
		 * натуральное число k. Объединить их в один массив, включив второй массив между
		 * k-м и (k+1) - м элементами первого, при этом не используя дополнительный
		 * массив.
		 */

		int mas1[] = { 6, 3, 78, 7, 3, 4, 5 };
		int mas2[] = { 3, 6, 2, 9, 65, 33, 2, 1, 2, 5 };
		int sum[];

		int k;
		int count;

		System.out.println();

		do {
			k = inputIntPositive("Введите K >>");

		} while ((k < 1) || k > mas1.length);

		sum = new int[mas1.length + mas2.length];

		count = 0;

		System.out.print("Соединенный массив :");

		for (int i = 0; i < sum.length; i++) {

			if ((i >= k) && (count < mas2.length)) {

				sum[i] = mas2[i - k];
				count++;
			} else {

				sum[i] = mas1[i - count];
			}
			System.out.print(sum[i] + " ");
		}
		System.out.println("\n");
	}

	public static void taskTwo() {

		/*
		 * Задача 2: Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ...
		 * <= bm . Образовать из них новую последовательность чисел так, чтобы она тоже
		 * была неубывающей. Примечание. Дополнительный массив не использовать.
		 */

		int mas1[] = { 2, 3, 6, 6, 7, 8, 8 };
		int mas2[] = { 1, 3, 6, 8, 9 };
		int sum[];

		int n;
		int m;
		int container;

		n = 0;
		m = 0;

		sum = new int[mas1.length + mas2.length];

		System.out.print("\nСоединенный массив :");

		for (int i = 0; i < sum.length; i++) {

			if (n < mas1.length) {

				sum[i] = mas1[n];
				n++;
			} else {

				sum[i] = mas2[m];
				m++;
			}

			System.out.print(sum[i] + " ");
		}

		System.out.print("\nОтсортированный массив :");

		for (int i = 0; i < sum.length; i++) {

			for (int j = i; j < sum.length; j++) {

				if (sum[i] > sum[j]) {

					container = sum[i];
					sum[i] = sum[j];
					sum[j] = container;
				}
			}
			System.out.print(sum[i] + " ");
		}

		System.out.println("\n");
	}

	public static void taskThree() {

		/*
		 * Задача 3: Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ...
		 * <= an.Требуется переставить элементы так, чтобы они были расположены по
		 * убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
		 * элемент и ставится на первое место, а первый - на место наибольшего. Затем,
		 * начиная со второго, эта процедура повторяется. Написать алгоритм сортировки
		 * выбором.
		 */

		int mas[] = { 2, 3, 6, 6, 7, 8, 8, 9, 10, 11, 12 };

		int container;

		System.out.print("\nОтсортированный массив :");

		for (int i = 0; i < mas.length; i++) {

			for (int j = i; j < mas.length; j++) {

				if (mas[i] < mas[j]) {

					container = mas[i];
					mas[i] = mas[j];
					mas[j] = container;
				}
			}
			System.out.print(mas[i] + " ");
		}
		System.out.println("\n");
	}

	public static void taskFour() {

		/*
		 * Задача 4: Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ...
		 * <= an.Требуется переставить числа в порядке возрастания. Для этого
		 * сравниваются два соседних числа ai и ai+1 . Если ai > ai+1 , то делается
		 * перестановка. Так продолжается до тех пор, пока все элементы не станут
		 * расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая
		 * при этом количества перестановок.
		 */

		int mas[] = { 2, 3, 6, 6, 7, 8, 8, 9, 10, 11, 12 };

		int count;
		int score;
		int container;
		int i;

		score = 0;
		count = 0;
		i = 0;

		System.out.print("\nОтсортированный массив :");

		while (true) {

			if (((mas.length - 1) == (i + 1)) && (count == 0)) {
				break;
			}

			if ((mas.length - 1) == (i + 1)) {
				count = 0;
				i = 0;
			} else {
				i++;
			}

			if (mas[i] < mas[i + 1]) {
				container = mas[i];
				mas[i] = mas[i + 1];
				mas[i + 1] = container;
				count++;
				score++;
			}
		}

		for (int j = 0; j < mas.length; j++) {

			System.out.print(mas[j] + " ");
		}
		System.out.println("\nКоличество перестановок - " + score + "\n");
	}

	public static void taskFive() {

		/*
		 * Задание 5: Сортировка вставками. Дана последовательность чисел a1, a2,...,
		 * an. Требуется переставить числа в порядке возрастания. Делается это следующим
		 * образом. Пусть a1, a2,..., ai - упорядоченная последовательность, т. е. a1 <=
		 * a2 <=...<= an. Берется следующее число ai+1 и вставляется в
		 * последовательность так, чтобы новая последовательность была тоже
		 * возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до
		 * n не будут перебраны. Примечание. Место помещения очередного элемента в
		 * отсортированную часть производить с помощью двоичного поиска. Двоичный поиск
		 * оформить в виде отдельной функции.
		 */

		int array[] = { 11, 3, 10, 4, 9, 0, 8 };

		int value;
		int box;

		for (int i = 1; i < array.length; i++) {
			value = binarySearch(array, array[i], i);

			if (value != i) {
				box = array[i];
				array[i] = 0;

				for (int j = i; j >= 0; j--) {

					if (value != j) {
						array[j] = array[j - 1];
						array[j - 1] = 0;
					} else {
						array[j] = box;
						break;
					}
				}
			}
		}

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n");
	}

	public static int binarySearch(int[] array, int key, int size) {

		int min;
		int max;
		int mid;

		min = 0;
		max = size;

		while (min < max) {

			mid = min + (max - min) / 2;

			if (array[mid] == key) {
				return mid;
			}

			if (array[mid] > key) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}

		return min;
	}

	public static void taskSix() {

		/*
		 * Задание 6: Сортировка Шелла. Дан массив n действительных чисел. Требуется
		 * упорядочить его по возрастанию. Делается это следующим образом: сравниваются
		 * два соседних элемента ai и ai+1. Если ai <= ai+1 , то продвигаются на один
		 * элемент вперед. Если ai => ai+1 , то производится перестановка и сдвигаются
		 * на один элемент назад. Составить алгоритм этой сортировки.
		 */

		double mas[];

		double container;
		int n;
		int j;

		System.out.println();

		n = inputIntPositive("Введите n >>");

		j = 0;

		mas = new double[n];

		for (int i = 0; i < mas.length; i++) {

			mas[i] = inputDouble("mas [" + i + "] >>");
		}

		/*
		 * for (int i = 0; i < mas.length ; i++) {
		 * 
		 * if (mas[i] > mas[i + 1]) {
		 * 
		 * container = mas[i]; mas[i] = mas[i + 1]; mas[i + 1] = container; i--;
		 * 
		 * System.out.println(mas[i] + " " + mas[i+1]); }
		 * 
		 * }
		 */

		while (true) {

			if (mas[j] > mas[j + 1]) {

				container = mas[j];
				mas[j] = mas[j + 1];
				mas[j + 1] = container;
				j--;

				if (j < 0) {
					j = 0;
				}

			} else if (mas[j] <= mas[j + 1]) {

				j++;
			}

			if (j == mas.length - 1) {
				break;
			}
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + " ");
		}

		System.out.println("\n");
	}

	public static void taskSeven() {

		/*
		 * Задание 7: Пусть даны две неубывающие последовательности действительных чисел
		 * a1<= a2 <=...<=an и b1 <= b2 <=...<=bm. Требуется указать те места, на
		 * которые нужно вставлять элементы последовательности b1 <= b2 <=...<=bm в
		 * первую последовательность так, чтобы новая последовательность оставалась
		 * возрастающей.
		 */

		int mas1[] = { 2, 3, 6, 6, 7, 10, 11 };
		int mas2[] = { 1, 4, 5, 6, 8, 9 };

		int array[];

		int i;
		int j;
		int k;
		int m;

		array = new int[mas1.length + mas2.length];

		i = 0;
		j = 0;
		k = 0;
		m = 0;

		System.out.println();

		for (int n = 0; n < mas1.length; n++) {

			if (mas1[n] >= mas2[m] && n < mas1.length - 1) {
				System.out.println("Элемент: " + mas2[m] + " Номер места: " + n);

				m++;

			}
			if ((n == mas1.length - 1) && (m < mas2.length)) {

				if (mas1[n] >= mas2[m]) {
					System.out.println("Элемент: " + mas2[m] + " Номер места: " + n);
				} else {
					System.out.println("Элемент: " + mas2[m] + " Номер места: " + n);
				}

				if (m < mas2.length - 1) {
					m++;
					n--;
				}
			}
		}

		while (true) {

			if ((i < mas1.length) && (j < mas2.length)) {

				if (mas1[i] <= mas2[j]) {

					array[k] = mas1[i];

					i++;
					k++;
				} else if (mas1[i] >= mas2[j]) {

					array[k] = mas2[j];

					j++;
					k++;

				}

				/*
				 * else if (mas1[i] == mas2[j]) {
				 * 
				 * array[k] = mas1[i]; k++; array[k] = mas2[j];
				 * 
				 * i++; j++; k++; }
				 */

			} else if ((mas1.length == i) && (j < mas2.length)) {

				array[k] = mas2[j];
				j++;
				k++;

			} else if ((mas2.length == j) && (i < mas1.length)) {

				array[k] = mas1[i];
				i++;
				k++;
			}
			if ((mas1.length == i) && (mas2.length == j)) {

				break;
			}
		}

		System.out.println("\nПолученый возрастающий массив:");

		for (int q = 0; q < array.length; q++) {
			System.out.print(array[q] + " ");
		}

		System.out.println("\n");
	}

	public static void taskEight() {

		/*
		 * Задание 8: Даны дроби p1/q1, p2/q2, ..., pn/qn ( pi, qi - натуральные).
		 * Составить программу, которая приводит эти дроби к общему знаменателю и
		 * упорядочивает их в порядке возрастания.
		 */

		int mas[][] = { { 1, 2 }, { 3, 7 }, { 2, 3 }, { 7, 9 }, { 4, 5 }, { 5, 8 }, { 1, 3 } };

		int allDenominator;
		int box;
		int index;

		index = 0;
		allDenominator = 0;

		for (int i = 0; i < mas.length; i++) {

			if (allDenominator == 0) {
				allDenominator = mas[0][1];
			}
			allDenominator = NOK(allDenominator, mas[i][1]);
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if (j == 0) {
					mas[i][j] = allDenominator / mas[i][j + 1];
				} else if (j == 1) {
					mas[i][j] = allDenominator;
				}
			}
		}

		while (true) {

			if (mas[index][0] > mas[index + 1][0]) {

				box = mas[index][0];
				mas[index][0] = mas[index + 1][0];
				mas[index + 1][0] = box;

				if (index != 0) {
					index--;
				}
			}

			if ((mas[index][0] <= mas[index + 1][0]) && (index < mas.length - 1)) {
				index++;
			}

			if (index >= mas.length - 1) {
				break;
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int NOD(int a, int b) {

		return b == 0 ? a : NOD(b, a % b);
	}

	public static int NOK(int a, int b) {

		return a * b / NOD(a, b);
	}
}