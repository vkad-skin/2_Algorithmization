package by.epam.algorithmization.matrix;

import java.util.Scanner;

public class Task_1_16 {
	
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
		info += "Массивы массивов 1-10.\n";
		info += "Выход из программы - 0.\n";
		info += ">>";
		
		return info;
	}
	
	public static void viewInfo(String text) {
		
		System.out.print(text);
	}

	public static int inputCansole() {
		
		int value;
		
		do {
			viewInfo(textMenu());
			
			while (!scan.hasNextInt()) {
				
				viewInfo(textMenu());
				scan.nextLine();
			}
			value = scan.nextInt();
			
		} while ((value < 0) || (value >16));
		
		return value;
	}
	
	public static int inputInt(String text) {
		
		int value;

		viewInfo(text);

		while (!scan.hasNextInt()) {

			viewInfo(text);
			scan.nextLine();
		}
		
		value = scan.nextInt();

		return value;
	}
	
	public static int inputIntPositive(String text) {

		int value;
		do {
			
			viewInfo(text);
			
			while (!scan.hasNextInt()) {

				viewInfo(text);
				scan.nextLine();
			}
			
			value = scan.nextInt();

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
			
		case 11:
			taskEleven();
			break;
			
		case 12:
			taskTwelve();
			break;
			
		case 13:
			taskThirteen();
			break;
			
		case 14:
			taskFourteen();
			break;
		
		case 15:
			taskFifteen();
			break;
			
		case 16:
			taskSixteen();
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
		 * Задача 1: Дана матрица. Вывести на экран все нечетные столбцы, у
		 * которых первый элемент больше последнего.
		 */
		
		int[][] mas;
		
		mas = new int[][] { {2, 5, 7, 8}, 
							{2, 8, 2, 6},
							{10, 7, 3, 2},
							{4, 5, 20, 1},
							{9, 4, 6, 2} };

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if ((j % 2 != 0) && (mas[0][j] > mas[mas.length - 1][j])) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void taskTwo() {
		
		/*
		 * Задание 2: Дана квадратная матрица. Вывести на экран элементы, стоящие
		 * на диагонали.
		 */
		
		int[][] mas;

		int[] leftDiagonal;
		int[] rightDiagonal;
		
		mas = new int[][] { {2, 5, 7, 8}, 
							{2, 8, 2, 6},
							{1, 7, 3, 2},
							{4, 5, 2, 1} };
		
		leftDiagonal = new int[mas.length];
		rightDiagonal = new int[mas[0].length];

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if (i == j) {
					leftDiagonal[i] = mas[i][j];
					// System.out.print(mas[i][j] + " ");
				}
				if (mas.length - 1 - i == j) {
					rightDiagonal[i] = mas[i][j];
					// System.out.print(mas[i][j] + " ");
				}
			}
		}

		for (int i : leftDiagonal) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i : rightDiagonal) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
	
	public static void taskTree() {
		
		/*
		 * Задание 3: Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		 */
		
		int [][] mas;
		
		mas = new int[][] { {2, 5, 7, 8}, 
							{2, 8, 2, 6},
							{10, 7, 3, 2},
							{4, 5, 20, 1},
							{9, 4, 6, 2} };

		int k;
		int p;

		k = 0;
		p = 0;
		
		System.out.println();

		while (k == 0) {

			k = inputIntPositive("Строчка k >>");
		}

		while (p == 0) {

			p = inputIntPositive("Столбец k >>");
		}

		System.out.print("Строчка " + k + " :");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if (k == i) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}

		System.out.print("\nСтолбец " + p + " :");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if (p == j) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}
		System.out.println("\n");
	}
	
	public static void taskFour() {
		
		/*
		 * Задание 4: Сформировать квадратную матрицу порядка n по заданному
		 * образцу(n - четное): 1 2 3 4 
         *                      4 3 2 1 
         *                      1 2 3 4 
         *                      4 3 2 1
         *                      
		 */

		int[][] mas;

		int n;
		
		System.out.println();
		
		do {
			n = inputIntPositive("Квадратная матрица размерности (четное число)  n >>");

		} while ((n == 0) || (n % 2 != 0));
		
		mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if ((i % 2 == 0) || (i == 0)) {
					
					mas[i][j] = j + 1;
				} else {
					
					mas[i][j] = mas.length - j;
				}
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void taskFive() {
		

		/*
		 * Задание 5: Сформировать квадратную матрицу порядка n по заданному
		 * образцу(n - четное): 1 1 1 1
		 * 						2 2 2 0 
		 * 						3 3 0 0
		 * 						4 0 0 0
		 * 						
		 */
		
		int[][] mas;

		int n;
		int count;

		count = 0;
		
		System.out.println();
		
		do {
			n = inputIntPositive("Квадратная матрица размерности (четное число)  n >>");

		} while ((n == 0) || (n % 2 != 0));

		mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if (mas.length - count <= j) {
					mas[i][j] = 0;
					
				} else {
					mas[i][j] = i + 1;
				}
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
			
			count++;
		}
		System.out.println();
	}
	
	public static void taskSix() {
		
		/*
		 * Задание 6: Сформировать квадратную матрицу порядка n по заданному
		 * образцу(n - четное): 1 1 1 1
		 * 						0 1 1 0
		 * 						0 1 1 0
		 * 						1 1 1 1
		 */
		
		int[][] mas;

		int n;
		int count;

		System.out.println();

		do {
			n = inputIntPositive("Квадратная матрица размерности (четное число)  n >>");

		} while ((n == 0) || (n % 2 != 0));

		mas = new int[n][n];

		count = mas.length / 2;

		for (int i = 0; i < mas.length; i++) {

			if (i >= count) {
				count--;
			}

			for (int j = 0; j < mas[0].length; j++) {

				mas[i][j] = 1;

				if (mas.length / 2 > i) {

					if ((j < i) || (j >= mas.length - i)) {
						mas[i][j] = 0;
					}

				} else {

					if ((j < count) || (j >= mas.length - count)) {
						mas[i][j] = 0;
					}
				}
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void taskSeven() {
		
		/*
		 * Задание 7: Сформировать квадратную матрицу порядка N по правилу: 
		 * A[I, J] = sin((I^2) + (J^2)) / N;
		 */
		
		double [][] mas;

		int n;
		int count;
		
		count = 0;

		do {
			n = inputIntPositive("Квадратная матрица размерности n >>");
			
		} while ((n % 2 != 0) || (n == 0));

		mas = new double[n][n];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				mas[i][j] = Math.sin((Math.pow(i + 1, 2) - Math.pow(j + 1, 2))
						/ (double) n);
				
				if (mas[i][j] > 0) {
					count++;
				}

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Количество положительных элементов:" + count);
	}
	
	public static void taskEight() {
		
		/*
		 * Задание 8: В числовой матрице поменять местами два столбца любых
		 * столбца, т. е. все элементы одного столбца поставить на
		 * соответствующие им позиции другого, а его элементы второго
		 * переместить в первый. Номера столбцов вводит пользователь с
		 * клавиатуры.
		 */
		
		int columnOne;
		int columnTwo;
		int count;
		
		int[][] mas;
		
		mas = new int[][] { {2, 5, 7, 8, 5, 7}, 
							{2, 8, 2, 6, 9, 1},
							{1, 7, 3, 2, 2, 5},
							{4, 5, 2, 1, 4, 2},
							{9, 4, 6, 2, 8, 0} };
		
		count = 0;

		System.out.println();

		do {
			columnOne = inputIntPositive("Введите первый стобец (от 1 до "
					+ mas[0].length + ") >>");

		} while ((columnOne == 0) || (mas[0].length < columnOne));

		do {
			columnTwo = inputIntPositive("Введите второй стобец (от 1 до "
					+ mas[0].length + " >>");

		} while ((columnTwo == 0) || (columnOne == columnTwo)
				|| (mas[0].length < columnOne));

		columnOne -= 1;
		columnTwo -= 1;

		System.out.println("Первоначальный массив :");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if (j == columnOne) {
					
					count = mas[i][j];
					mas[i][j] = mas[i][columnTwo];
					mas[i][columnTwo] = count;
				}
			}
		}

		System.out.println("\nНовый массив с перестановкой:");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void taskNine() {
		
		/*
		 * Задание 9: Задана матрица неотрицательных чисел. Посчитать сумму
		 * элементов в каждом столбце. Определить, какой столбец содержит
		 * максимальную сумму.
		 */
		
		int sum;
		int columnMax;
		int columnCount;
		
		int[][] mas;

		mas = new int[][] { {2, 5, 7, 8, 5, 7}, 
							{2, 8, 2, 6, 9, 1},
							{1, 7, 3, 2, 2, 5},
							{4, 5, 2, 9, 4, 2},
							{9, 4, 6, 9, 8, 0} };
		
		columnCount = 0;
		columnMax = 0;
		sum = 0;
		
		System.out.println("\nПервоначальный массив :");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int j = 0; j < mas[0].length; j++) {
			
			for (int i = 0; i < mas.length; i++) {
				
				columnCount += mas[i][j];
			}
			
			if (columnCount > sum) {
				
				columnMax = j;
				sum = columnCount;
			}
			columnCount = 0;
		}
		
		System.out.println("Самая большая сумма (" + sum + ") в столбце " + (columnMax + 1));
		System.out.println();
	}
	
	public static void taskTen() {

		/*
		 * Задание 10: Найти положительные элементы главной диагонали квадратной
		 * матрицы.
		 */

		int mas[][];

		int n;
		int count;

		n = 0;
		count = 0;
		
		System.out.println();
		
		do {
			n = inputIntPositive("Введите размерность квадратной матрицы >>");

		} while ((n == 0) || (n % 2 != 0));

		mas = new int[n][n];

		System.out.println("Ввод элементов массива:");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				mas[i][j] = inputInt("Введите элемент матрицы mas [" + (i + 1)
						+ "][" + (j + 1) + "] >>");
			}
		}
		System.out.println("Полученый квадратный массив:");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

		System.out
				.print("Все положительные элементы главной диагонали матрицы: ");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if (i == j) {
					
					if (mas[i][j] > 0) {
						
						System.out.print(mas[i][j] + " ");
						count++;
					}
				}
			}
		}

		if (count == 0) {
			System.out
					.println("Все элементы главной диагонали матрицы отрицательные или равны 0!");
		}
		
		System.out.println("\n");
	}
	
	public static void taskEleven() {
		
		/*
		 * Задание 11: Матрицу 10x20 заполнить случайными числами от 0 до 15.
		 * Вывести на экран саму матрицу и номера строк, в которых число 5
		 * встречается три и более раз.
		 */
		
		int mas[][];

		int count;
		int register;

		mas = new int[10][20];

		count = 0;
		register = 0;

		System.out.println("\nМассив из рандомных чисел (от 0 до 15) :");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				mas[i][j] = (int) (16 * Math.random());
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				if (mas[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {

				System.out.println("Строка " + (i + 1)
						+ " в которой число 5 встречается " + count
						+ " раз(а);");

				register++;
			}
			count = 0;
		}

		if (register == 0) {

			System.out.println("Нет строк подходящие условию!");
		}

		System.out.println();
	}
	
	public static void taskTwelve() {
		
		/*
		 * Задание 12: Отсортировать строки матрицы по возрастанию и убыванию
		 * значений элементов.
		 */
		
		int mas[][];

		int n;
		int m;
		int count;
		
		System.out.println();
		
		do {
			n = inputIntPositive("Введите число строк матрицы n >>");
		} while (n == 0);

		do {
			m = inputIntPositive("Введите число столбцов матрицы m >>");
		} while (m == 0);
		
		mas = new int [n][m];
		
		System.out.println("Получившийся массив :");
		
		for (int i = 0; i < mas.length; i++) {
			
			for (int j = 0; j < mas[0].length; j++) {
				
				mas [i][j] = (int) (11 * Math.random());
				System.out.print(mas [i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Сортировка по возрастанию :");
		
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				for (int sort = (0 + j); sort < mas[0].length; sort++) {

					if (mas[i][j] > mas[i][sort]) {

						count = mas[i][sort];
						mas[i][sort] = mas[i][j];
						mas[i][j] = count;
					}
				}
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Сортировка по убыванию :");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				for (int sort = (0 + j); sort < mas[0].length; sort++) {

					if (mas[i][j] < mas[i][sort]) {

						count = mas[i][sort];
						mas[i][sort] = mas[i][j];
						mas[i][j] = count;
					}
				}
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void taskThirteen() {

		/*
		 * Задание 13: Отсортировать столбцы матрицы по возрастанию и убыванию
		 * значений элементов.
		 */

		int mas[][];

		int n;
		int m;
		int count;

		System.out.println();

		do {
			n = inputIntPositive("Введите число строк матрицы n >>");
		} while (n == 0);

		do {
			m = inputIntPositive("Введите число столбцов матрицы m >>");
		} while (m == 0);

		mas = new int[n][m];

		System.out.println("Получившийся массив :");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				mas[i][j] = (int) (11 * Math.random());
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Сортировка по возрастанию :");

		for (int j = 0; j < mas[0].length; j++) {

			for (int i = 0; i < mas.length; i++) {

				for (int sort = (0 + i); sort < mas.length; sort++) {

					if (mas[i][j] > mas[sort][j]) {

						count = mas[sort][j];
						mas[sort][j] = mas[i][j];
						mas[i][j] = count;
					}
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Сортировка по убыванию :");

		for (int j = 0; j < mas[0].length; j++) {

			for (int i = 0; i < mas.length; i++) {

				for (int sort = (0 + i); sort < mas.length; sort++) {

					if (mas[i][j] < mas[sort][j]) {

						count = mas[sort][j];
						mas[sort][j] = mas[i][j];
						mas[i][j] = count;
					}
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void taskFourteen() {

		/*
		 * Задание 14: Сформировать случайную матрицу m x n, состоящую из нулей
		 * и единиц, причем в каждом столбце число единиц равно номеру столбца.
		 */

		int mas[][];

		int m;
		int n;
		int count;

		m = (int) (10 * Math.random() + 1);
		n = (int) (10 * Math.random() + 1);

		while (m < n) {
			m = (int) (10 * Math.random() + 1);
		}

		mas = new int[m][n];

		for (int j = 0; j < mas[0].length; j++) {

			count = 0;

			for (int i = 0; i < mas.length; i++) {

				mas[i][j] = (int) (2 * Math.random());

				if (mas[i][j] == 1) {
					count++;
				}

				if (count > (j + 1)) {

					do {
						mas[i][j] = (int) (2 * Math.random());
						
					} while (mas[i][j] != 0);

				}
				
				if ((count < (j + 1)) && ((i + 1) >= (mas.length - j))
						&& (mas[i][j] == 0)) {

					do {
						mas[i][j] = (int) (2 * Math.random());
						
					} while (mas[i][j] != 1);

					count++;
				}
			}
		}

		System.out.println("\nСлучайная матрица m*n :");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void taskFifteen() {

		/*
		 * Задание 15: Найдите наибольший элемент матрицы и заменить все
		 * нечетные элементы на него.
		 */
		
		int mas[][];
		
		int m;
		int n;
		int max;
		
		System.out.println();
		
		do {
			m = inputIntPositive("Введите количество строк m >>");
			
		} while (m == 0);
		
		do {
			n = inputIntPositive("Введите количество столбцов n >>");
			
		} while (n == 0);
		
		max = 0;
		
		mas = new int [m][n];
		
		System.out.println("Введите элементы матрицы :");
		
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {
				
				do {
					mas[i][j] = inputInt("Введите mas[" + (i + 1) + "]["
							+ (j + 1) + "] >>");
					
				} while (mas[i][j] == 0);
			}
		}
		
		System.out.println("Введенная матрица :");
		
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {
				
				max = (max < mas[i][j]) ? mas[i][j] : max;
				
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Преобразованная матрица :");
		
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[0].length; j++) {
				
				mas[i][j] = (mas[i][j] % 2 == 0) ? mas[i][j] : max; 
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void taskSixteen() {
		
		/*
		 * Задание 16: Магическим квадратом порядка n называется квадратная
		 * матрица размера nxn, составленная из чисел 1, 2, 3, ..., 2 n так, что
		 * суммы по каждому столбцу, каждой строке и каждой из двух больших
		 * диагоналей равны между собой. 
		 */
		
		int mas[][];
		
		int n;
		int row;
		int column;
		int number;
		int lastColumn;
		int lastRow;
		
		do {
			n = inputIntPositive("Введите размерность квадратной матрицы n >>");
			
		} while ((n == 0) || (n % 2 == 0));
		
		mas = new int [n][n];
		
		number = 1;
		row = 0;
		column = mas.length / 2;
		
		while (n * n >= number) {
			
			mas[row][column] = number;
			//System.out.println(mas[row][column] +" "+ row + " " + column);
			number++;
			
			lastRow = row;
			lastColumn = column;
			
			row -=1;
			column +=1;
			
			if ((row < 0) && (column >= mas.length)) {
				column = lastRow;
				row = lastColumn;
			}
			
			if (row < 0) {
				row = mas.length - 1;
			}
			if (column >= mas.length) {
				column = 0;
			}
			if ((mas[row][column] != 0)) {
				row = lastRow + 1;
				column = lastColumn;
			}
			//System.out.println(mas[row][column]);
		}
		
		int sum;
		
		for (int i = 0; i < mas.length; i++) {
			sum = 0;
			for (int j = 0; j < mas[0].length; j++) {
				sum += mas[i][j];
				System.out.print(mas[i][j] + " ");
			}
			System.out.println(sum);
		}
	}
	
	public static void exit() {
		
		System.out.println("\nВыход из программы.");
		scan.close();
	}
}
