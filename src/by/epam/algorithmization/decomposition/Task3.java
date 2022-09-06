package by.epam.algorithmization.decomposition;

/*
 * Задание 3: Вычислить площадь правильного шестиугольника со стороной а, 
 * используя метод вычисления площади треугольника.
 */

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Площадь правильного шестиугольника со стороной a = 3 равна: " + areaRegularHexagon(3));
	}

	public static double areaEquilateralTriangle(double side) {

		return (3 * Math.sqrt(3)) / 2 * Math.pow(side, 2);
	}

	public static double areaRegularHexagon(double side) {

		return 6 * areaEquilateralTriangle(side);
	}
}
