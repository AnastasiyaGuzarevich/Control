package by.epam.tt.main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		double x;
		double y;

		x = inputDoubleFromConsole("Enter the first number => ");
		y = inputDoubleFromConsole("Enter the second number => ");

		double f;

		f = method(x, y);

		rezaltPrint(x, y, f);

	}

	/////////////////////////////////////////////////////////////////
	public static double inputDoubleFromConsole(String message) {
		double value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter a DOUBLE!\n" + message);
		}
		value = sc.nextDouble();
		return value;
	}

	/////////////////////////////////////////////////////////////////////
	public static double method(double c, double d) {
		double a = 1.0;
		double b = 2.0;
		double z;

		z = (a + Math.pow(Math.sin(c + d), b)) / (b + Math.abs(c - b * c / (a + Math.pow(c, b) * Math.pow(d, b)))) + c;

		return z;
	}

	/////////////////////////////////////////////////////////////////////
	public static void rezaltPrint(double a, double b, double rez) {
		System.out.println(" ");
		System.out.println("x = " + a + "\t y = " + b);
		System.out.println(" ");
		System.out.printf("f = %4.2f \n", rez);
	}
}
