package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/* 
 * Задание 4: На плоскости заданы своими координатами n точек. 
 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. 
 * Указание. Координаты точек занести в массив.
 */

public class Task4 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amountPoint;
		double distanceMax;

		double arrayPoint[][];

		amountPoint = inputAmountPoint("Введите количество точек (от 2 и более точек) >>");

		arrayPoint = new double[amountPoint][2];

		initializeCoordinate(arrayPoint);
		distanceMax = maxDistancePoint(arrayPoint);

		System.out.println(distanceMax);
	}

	public static double maxDistancePoint(double arrayPoint[][]) {

		double distance;
		double distanceMax;

		distanceMax = 0;

		for (int i = 0; i < arrayPoint.length; i++) {
			for (int j = 1; j < arrayPoint.length; j++) {

				distance = Math.pow(arrayPoint[i][0] - arrayPoint[j][0], 2)
						+ Math.pow(arrayPoint[i][1] - arrayPoint[j][1], 2);
				distance = Math.sqrt(distance);

				if (distance > distanceMax) {
					distanceMax = distance;
				}
			}
		}
		return distanceMax;
	}

	public static double[][] initializeCoordinate(double arrayPoint[][]) {

		for (int i = 0; i < arrayPoint.length; i++) {
			for (int j = 0; j < arrayPoint[0].length; j++) {

				if (j == 0) {
					arrayPoint[i][j] = inputCoordinatePoint("Введите x" + (i + 1) + " >>");
				} else {
					arrayPoint[i][j] = inputCoordinatePoint("Введите y" + (i + 1) + " >>");
				}
			}
		}
		return arrayPoint;
	}

	public static int inputAmountPoint(String text) {

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

	public static double inputCoordinatePoint(String text) {

		double value;

		System.out.print(text);

		while (!scan.hasNextDouble()) {

			System.out.print(text);
			scan.nextLine();
		}
		value = scan.nextDouble();

		return value;
	}

}
