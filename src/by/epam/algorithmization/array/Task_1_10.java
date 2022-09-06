package by.epam.algorithmization.array;

import java.util.Scanner;

public class Task_1_10 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberTask;

		numberTask = -1;

		while (numberTask != 0) {

			numberTask = inputCansole(viewInfo());
			taskMenu(numberTask);
		}
	}

	public static String viewInfo() {

		String info;

		info = "Выберете заданиe:\n";
		info += "Одномерные массивы 1-10.\n";
		info += "Выход из программы - 0.\n";
		info += ">>";

		return info;
	}

	public static int inputCansole(String text) {

		int value;

		do {
			System.out.print(text);

			while (!scan.hasNextInt()) {

				System.out.println(text);
				scan.nextLine();
			}

			value = scan.nextInt();

		} while (value < 0 || value > 10);

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

	public static double inputDoublePositive(String text) {

		double value;

		do {
			System.out.print(text);

			while (!scan.hasNextDouble()) {
				System.out.print(text);
				scan.nextLine();
			}
			value = scan.nextDouble();

		} while (value < 0);

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
			taskTree();
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
		case 8:
			taskEight();
			break;
		case 9:
			taskNine();
			break;
		case 10:
			taskTen();
			break;
		case 0:
			exit();
			break;
		default:
			System.out.println("Ошибка выбора задания!");
			break;
		}
	}

	public static void taskOne() {

		/*
		 * Задание 1: В массив A [N] занесены натуральные числа. Найти сумму тех
		 * элементов, которые кратны данному К.
		 */

		int k;
		int sum;

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		sum = 0;

		System.out.println();

		k = inputIntPositive("Введите K >> ");

		for (int i = 0; i < a.length; i++) {

			if (a[i] % k == 0) {
				sum += a[i];
			}
		}

		System.out.println("Сумма чисел которые кратны K равно:" + sum + "\n");
	}

	public static void taskTwo() {

		/*
		 * Задание 2: Дана последовательность действительных чисел а1 ,а2 ,...,
		 * аn. Заменить все ее члены, большие данного Z, этим числом. Подсчитать
		 * количество замен.
		 */

		double[] x = { 1.4, 5.3, 5, 7.7, 3, 2, 4, 4.3, 7, 7.1 };

		double z;
		int count;

		count = 0;

		System.out.println();

		z = inputDouble("Введите Z >>");

		System.out.print("Новый массив :");

		for (int i = 0; i < x.length; i++) {

			if (x[i] > z) {
				x[i] = z;
				count++;
			}
			System.out.print(x[i] + " ");
		}
		System.out.println("\nКоличество замен :" + count + "\n");
	}

	public static void taskTree() {

		/*
		 * Задание 3: Дан массив действительных чисел, размерность которого N.
		 * Подсчитать, сколько в нем отрицательных, положительных и нулевых
		 * элементов.
		 */

		double[] mas;

		int n;
		int negativeCount;
		int positiveCount;
		int zeroCount;

		negativeCount = 0;
		positiveCount = 0;
		zeroCount = 0;
		n = 0;

		System.out.println();

		while (n == 0) {

			n = inputIntPositive("Введите размер массива N >>");
		}

		mas = new double[n];

		for (int i = 0; i < mas.length; i++) {

			mas[i] = inputDouble("Элемент массива [" + i + "]:");
		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > 0) {
				positiveCount++;

			} else if (mas[i] < 0) {
				negativeCount++;

			} else {
				zeroCount++;
			}
		}

		System.out.println("Отрицательные числа:" + negativeCount
				+ " Положительные числа:" + positiveCount
				+ " Числа равные нулю:" + zeroCount);

	}

	public static void taskFour() {

		/*
		 * Задание 4: Даны действительные числа а1 ,а2 ,..., аn. Поменять
		 * местами наибольший и наименьший элементы.
		 */

		double[] mas;

		int n;
		double maxNumber;
		double minNumber;

		n = 0;

		System.out.println();

		while (n == 0) {

			n = inputIntPositive("Введите размер массива N >>");
		}

		mas = new double[n];

		for (int i = 0; i < mas.length; i++) {

			mas[i] = inputDouble("Элемент массива [" + i + "]:");
		}

		maxNumber = mas[0];
		minNumber = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (maxNumber < mas[i]) {
				maxNumber = mas[i];

			} else if (minNumber > mas[i]) {
				minNumber = mas[i];
			}
		}

		System.out.print("Новый массив с перестановкой mas[] =");

		for (int i = 0; i < mas.length; i++) {

			if (maxNumber == mas[i]) {
				mas[i] = minNumber;

			} else if (minNumber == mas[i]) {
				mas[i] = maxNumber;
			}

			System.out.print("[" + mas[i] + "] ");
		}
		System.out.println("\n");
	}

	public static void taskFive() {

		/*
		 * Задание 5:Даны целые числа а1 ,а2 ,..., аn.Вывести на печать только
		 * те числа, для которых аi > i.
		 */

		int[] mas;

		int n;

		n = 0;

		System.out.println();

		while (n == 0) {

			n = inputIntPositive("Введите размер массива N >>");
		}

		mas = new int[n];

		for (int i = 0; i < mas.length; i++) {

			mas[i] = inputInt("Элемент массива [" + i + "]:");
		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > (i + 1)) {
				System.out
						.println("Элемент массива подходящий под условие (mas[i] > i) "
								+ mas[i] + " > " + i);
			}
		}
		System.out.println();
	}

	public static void taskSix() {

		/*
		 * Задание 6: Задана последовательность N вещественных чисел. Вычислить
		 * сумму чисел, порядковые номера которых являются простыми числами.
		 */

		int n;
		int count;

		double sum;

		double[] mas;

		n = 0;

		while (n == 0) {

			n = inputIntPositive("Введите размерность массива N >>");
		}

		mas = new double[n];

		sum = 0;

		for (int i = 0; i < mas.length; i++) {

			mas[i] = inputDouble("Введите элементы массива mas[" + i + "] :");
		}

		for (int i = 0; i < mas.length; i++) {

			count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				sum += mas[i];
			}
		}

		System.out.println("Сумма чисел элементы которых простые : " + sum
				+ "\n");
	}

	public static void taskSeven() {

		/*
		 * Задание 7: Даны действительные числа a1,a2,...,an. Найти
		 * max(a1+a2*n,a2+a2*n-1,...,an+an+1).
		 */

		double[] mas = { 10, 24, 36, 4, 5, 62, 7, 83, 9, 105 };

		double a;
		double max;

		max = 0;

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			a = mas[i] + mas[mas.length - i - 1];

			max = (a > max) ? a : max;
		}

		System.out.println("max = " + max + "\n");
	}

	public static void taskEight() {

		/*
		 * Задание 8: Дана последовательность целых чисел a1, a2,..., an.
		 * Образовать новую последовательность, выбросив из исходной те члены,
		 * которые равны min(a1, a2,..., an).
		 */

		int[] mas = { 1, 1, 2, 3, 4, 5, 1, 6, 7, 8, 9, 1, 10 };
		int[] masTwo;

		int n;
		int count;

		n = mas[0];
		count = 0;

		System.out.print("\nПервоначальный массив :");

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] <= n) {
				n = mas[i];
			}

			System.out.print(mas[i] + " ");
		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] == n) {
				count++;
			}
		}

		masTwo = new int[mas.length - count];

		count = 0;

		for (int i = 0; i < mas.length; i++) {

			if (n != mas[i]) {
				masTwo[i - count] = mas[i];

			} else {
				count++;
			}
		}

		System.out.print("\nКонечный массив без минимальных элементов :");

		for (int i = 0; i < masTwo.length; i++) {

			System.out.print(masTwo[i] + " ");
		}
		System.out.println("\n");
	}

	public static void taskNine() {

		/*
		 * Задание 9: В массиве целых чисел с количеством элементов n найти
		 * наиболее часто встречающееся число. Если таких чисел несколько, то
		 * определить наименьшее из них.
		 */

		int[] mas;

		int n;
		int count;
		int element;
		int countRepeated;
		int elementRepeated;

		n = 0;
		element = 0;
		countRepeated = 0;
		elementRepeated = 0;

		System.out.println();

		while (n == 0) {

			n = inputIntPositive("Размер массива n >>");
		}

		mas = new int[n];

		for (int i = 0; i < mas.length; i++) {

			mas[i] = inputInt("Элемент массива n[" + i + "]:");
		}

		System.out.print("Массив : ");

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + " ");
		}

		for (int i = 0; i < mas.length; i++) {

			count = 0;

			for (int j = 0; j < mas.length; j++) {

				if (mas[i] == mas[j]) {

					element = mas[i];
					count++;
				}
			}

			if (count > countRepeated) {

				countRepeated = count;
				elementRepeated = element;

			} else if (countRepeated == count) {

				elementRepeated = ((elementRepeated > element) ? element
						: elementRepeated);
			}
		}

		System.out
				.print("\nНаиболее часто встречающийся и наименьший элемент : "
						+ elementRepeated);
		System.out.println("\n");
	}

	public static void taskTen() {

		/*
		 * Задание 10: Дан целочисленный массив с количеством элементов n. Сжать
		 * массив, выбросив из него каждый второй элемент (освободившиеся
		 * элементы заполнить нулями). Примечание:(дополнительный массив не
		 * использовать).
		 */

		int[] mas;

		int n;

		n = 0;

		System.out.println();

		while (n == 0) {

			n = inputIntPositive("Размер массива n>>");
		}

		mas = new int[n];

		for (int i = 0; i < mas.length; i++) {

			while (mas[i] == 0) {
				mas[i] = inputIntPositive("Элемент массива n[" + i + "] : ");
			}
		}

		System.out.print("\nПреобразованный массив : ");

		for (int i = 0; i < mas.length; i++) {

			if ((i % 2 != 0) && (i != 0)) {
				mas[i] = 0;
			}

			System.out.print(mas[i] + " ");
		}

		System.out.print("\n");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length - 1; j++) {

				if (mas[j] == 0) {

					mas[j] = mas[j + 1];
					mas[j + 1] = 0;
				}
			}
		}

		System.out.print("\nСжатый массив : ");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("\n");
	}

	public static void exit() {

		System.out.println("Выход из программы.");
		scan.close();
	}

}
