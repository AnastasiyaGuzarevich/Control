package by.epam.tttt.main;

public class Task3 {

	public static void main(String[] args) {
		// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
		// шагом h.
		// Результат представить в виде таблицы,
		// первый столбец которой – значения аргумента, второй - соответствующие
		// значения функции.
		// F(x) = tg(x)

		double a = 1.0;
		double b = 10.0;
		double h = 1.0;

		printTableTitle();

		method(a, b, h);

		printTableEnd();

	}
	/////////////////////////////////////////////////////////////////////

	public static void printTableTitle() {
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
	}

	public static void method(double c, double d, double e) {
		double f;
		for (double x = c; x <= d; x = x + e) {
			f = method2(x);
			printTableLine(x, f);
		}
	}
	////////////////////////////////////////////////////////////////////////

	public static double method2(double x) {
		double f;
		f = Math.tan(x);
		return f;
	}
	///////////////////////////////////////////////////////////////////////

	public static void printTableLine(double a, double b) {
		System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", a, b);
	}
	////////////////////////////////////////////////////////////////////////

	public static void printTableEnd() {
		System.out.println("---------------------------------");
	}

}
