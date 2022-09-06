package by.epam.algorithmization.decomposition;

/*
 * Задание 1: Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 * НОК(А,В)=(А*В)/НОД(А,В).
 */

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("НОК (3, 7)= " + NOK(3, 7));
		System.out.println("НОК (2, 3)= " + NOK(3, 5));
		System.out.println("НОК (13, 9)= " + NOK(13, 9));
	}

	/*
	 * Метод NOD() - это наибольший общий делитель; Метод NOK() - это наименьшее
	 * общее кратное двух.
	 */

	public static int NOD(int firstNumber, int secondNumber) {

		return secondNumber == 0 ? firstNumber : NOD(secondNumber, firstNumber % secondNumber);
	}

	public static int NOK(int firstNumber, int secondNumber) {

		return firstNumber * secondNumber / NOD(firstNumber, secondNumber);
	}
}
