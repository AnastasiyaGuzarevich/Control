package by.epam.ttt.main;

import java.util.Scanner;

import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		// Программа запрашивает количество чисел, вводит целые числа в соответствии с
		// заявленным количеством ,определяет,
		// - сколько чисел > 15 или < 2,
		// - чему равна сумма чисел, которые делятся на 5 с остатком 4
		// Результат вывести на экран.

		int n;

		n = inputIntFromConsole("Enter Integer number => ");

		int[] mas = new int[n];

		fillingArray(mas);

		printArray(mas);

		int count = methodFirst(mas);

		int sum = methodSecond(mas);

		printRezalt(count, sum);

	}

	//////////////////////////////////////////////////////////////
	public static int inputIntFromConsole(String message) {
		int z;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Enter a Integer!\n" + message);
		}
		z = sc.nextInt();
		return z;
	}
	//////////////////////////////////////////////////////////////

	public static void fillingArray(int[] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);
		}
	}
	/////////////////////////////////////////////////////////////

	public static void printArray(int[] ar) {

		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.print(" " + ar[i] + " ");
		}
		System.out.println('\n');
	}
	/////////////////////////////////////////////////////////////

	public static int methodFirst(int[] ar) {
		int count1 = 0;
		int a = 15;
		int b = 2;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < b || ar[i] > a) {
				count1++;
			}
		}
		return count1;
	}
	/////////////////////////////////////////////////////////////////

	public static int methodSecond(int[] ar) {
		int summ = 0;
		int a = 5;
		int b = 4;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % a == b) {
				summ = summ + ar[i];
			}
		}
		return summ;
	}
	/////////////////////////////////////////////////////////////////

	public static void printRezalt(int a, int b) {
		System.out.println("count => " + a + "\n");
		System.out.println("sum => " + b);
	}

}
