package by.epam.algorithmization.decomposition;

/*
 * Задание 7: Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Сумма факториалов всех нечетных чисел (от 1 до 9) >>" + sumFactorial(1, 9));
	}

	public static int factorial(int number) {

		int factorialNumber;

		factorialNumber = 1;

		for (int i = 1; i <= number; i++) {
			factorialNumber = factorialNumber * i;
		}

		return factorialNumber;
	}

	public static int sumFactorial(int initialNumber, int finiteNumber) {

		int sum;

		sum = 0;

		for (int i = initialNumber; i <= finiteNumber; i = i + 2) {
			sum += factorial(i);
		}

		return sum;
	}

}
