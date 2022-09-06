package by.epam.algorithmization.decomposition;

import java.util.Scanner;

/*
 * Задание 9: Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
 * Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */

public class Task9 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sideX;
		double sideY;
		double sideZ;
		double sideT;
		double sideDiagonal;
		double semiPerimeter;
		double area;

		sideX = inputSideQuadrilateral("Введите сторону X четырехугольника (от 1 и более) >>");
		sideY = inputSideQuadrilateral("Введите сторону Y четырехугольника (от 1 и более) >>");

		sideDiagonal = sideDiagonalQuadrilateral(sideX, sideY);

		sideZ = inputSideQuadrilateral("Введите сторону Z четырехугольника (от 1 и более) >>");
		sideT = inputSideQuadrilateral("Введите сторону T четырехугольника (от 1 и более) >>");

		while (triangleExistenceRule(sideZ, sideT, sideDiagonal)) {

			outputTextError(sideZ, sideT, sideDiagonal);

			sideZ = inputSideQuadrilateral(
					"Введите сторону Z четырехугольника (от " + (sideDiagonal + 1) + " и более) >>", sideDiagonal + 1);
			sideT = inputSideQuadrilateral(
					"Введите сторону Z четырехугольника (от " + (sideDiagonal + 1) + " и более) >>", sideDiagonal + 1);
		}

		sideDiagonal = sideDiagonalQuadrilateral(sideX, sideY);
		semiPerimeter = semiPerimeterTriangle(sideZ, sideT, sideDiagonal);
		area = areaQuadrilateral(sideX, sideY, sideZ, sideT, semiPerimeter, sideDiagonal);

		outputText(area);
	}

	public static double inputSideQuadrilateral(String text) {

		double value;

		do {

			System.out.print(text);

			while (!scan.hasNextDouble()) {
				System.out.print(text);
				scan.nextLine();
			}

			value = scan.nextDouble();

		} while (value < 1);

		return value;
	}

	public static double inputSideQuadrilateral(String text, double sideDiagonal) {

		double value;

		do {

			System.out.print(text);

			while (!scan.hasNextDouble()) {
				System.out.print(text);
				scan.nextLine();
			}

			value = scan.nextDouble();

		} while (value < sideDiagonal);

		return value;
	}

	public static double areaQuadrilateral(double sideX, double sideY, double sideZ, double sideT, double semiPerimeter,
			double sideDiagonal) {

		double area;

		area = areaRightTriangle(sideX, sideY) + areaTriangle(sideZ, sideT, semiPerimeter, sideDiagonal);

		return area;
	}

	public static double areaRightTriangle(double sideX, double sideY) {

		double area;

		area = 0.5 * sideX * sideY;

		return area;
	}

	public static double areaTriangle(double sideZ, double sideT, double semiPerimeter, double sideDiagonal) {

		double area;

		area = semiPerimeter * (semiPerimeter - sideZ) * (semiPerimeter - sideDiagonal) * (semiPerimeter - sideT);
		area = Math.sqrt(area);

		return area;
	}

	public static double semiPerimeterTriangle(double sideZ, double sideT, double sideDiagonal) {

		double semiPerimeter;

		semiPerimeter = sideZ + sideT + sideDiagonal;
		semiPerimeter /= 2;

		return semiPerimeter;
	}

	public static double sideDiagonalQuadrilateral(double sideX, double sideY) {

		double diagonal;

		diagonal = Math.pow(sideX, 2) + Math.pow(sideY, 2);
		diagonal = Math.sqrt(diagonal);

		return diagonal;
	}

	public static void outputText(double area) {

		System.out.println("Площадь четырехуголника XYZT >> " + area);
	}

	public static void outputTextError(double sideZ, double sideT, double sideDiagonal) {

		System.out.println("Сумма сторон Z + T меньше диагонали (" + (sideT + sideZ) + " < " + sideDiagonal + ").");
	}

	public static boolean triangleExistenceRule(double sideZ, double sideT, double sideDiagonal) {

		if (sideZ + sideT > sideDiagonal) {
			return false;
		} else {
			return true;
		}
	}
}
