package by.epam.algorithmization.decomposition;

/*
 * Задание 2: Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("НОД (14, 28, 21, 42)= " + fourNamberNOD(3, 5, 10, 15));
	}

	public static int fourNamberNOD(int firstNumber, int secondNumber, int thirdNamber, int fourthNamber) {

		int overallDenominator;

		overallDenominator = NOD(firstNumber, secondNumber);
		overallDenominator = NOD(overallDenominator, thirdNamber);
		overallDenominator = NOD(overallDenominator, fourthNamber);

		return overallDenominator;
	}

	public static int NOD(int firstNumber, int secondNumber) {

		return secondNumber == 0 ? firstNumber : NOD(secondNumber, firstNumber % secondNumber);
	}
}
