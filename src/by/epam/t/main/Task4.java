package by.epam.t.main;

public class Task4 {

	public static void main(String[] args) {
		// Задан целочисленный массив размерности N.
		// Есть ли среди элементов массива простые числа? ("1" не является простым
		// числов)
		// Если да, то вывести номера этих элементов.

		int[] mas = new int[] { 5, 4, 11, 6, 23, 1, 7, 0, 8, 10 };

		System.out.println("Source array");
		printArray(mas);

		int n = primeNumber(mas);

		System.out.println("prime numbers " + n + "\n");

		int[] primeArray = new int[n];

		System.out.println("Index numbers of prime numbers");

		///////////////////////////////////////////////////////////////////////////////////////////
		// количество простых чисел посчитано,
		// не получилось вывести в массив ИНДЕКСЫ простых чисел,
		// поэтому я не выделяла данный участок в отдельный метод
		int count1 = 0;
		for (int i = 0, j = 0; i < mas.length; i++) {
			for (int k = 1; k <= mas[i]; k++) {
				if (mas[i] % k == 0) {
					count1++;
				}
			}
			if (count1 == 2) {
				primeArray[j] = mas[i];
				j++;
			}

		}
		///////////////////////////////////////////////////////////////////////////////////////////

		printArray(primeArray);

	}

///////////////////////////////////////////////////////////////////////////////////////
	private static int primeNumber(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int count1 = 0;
			for (int k = 1; k <= arr[i]; k++) {
				if (arr[i] % k == 0) {
					count1++;
				}
			}
			if (count1 == 2) {
				count++;
			}
		}
		return count;
	}

/////////////////////////////////////////////////////////////////////////////////////

	public static void printArray(int ar[]) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(" " + ar[i] + " ");
		}
		System.out.println('\n');
	}

}
