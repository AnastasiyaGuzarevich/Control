package by.epam.tor.main;

public class Task5 {

	public static void main(String[] args) {
		// Дана целочисленная таблица А[n]. Найти наименьшее число K элементов,
		// которые можно выкинуть из данной последовательности, так чтобы осталась
		// возрастающая подпоследовательность.

		int[] mas = new int[] { 1, 3, 8, 7, 4, 9, 10, 5, 11, 16, 12 };

		System.out.println("Source array");
		printArray(mas);

		int n = countExcessElements(mas); // кол-во лишних эл-тов

		int m = lengthIncreasingArray(mas); // кол-во эл-ов возрастающего массива
		
		printResult(n, m);

		int[] increasingArray = new int[m];

		creatingIncreasingArray(mas, increasingArray);

		System.out.println("Increasing array");
		printArray(increasingArray);

	}
	//////////////////////////////////////////////////////////////////////////////

	public static void printArray(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(" " + ar[i] + " ");
		}
		System.out.println('\n');
	}
	/////////////////////////////////////////////////////////////////////////////

	private static int countExcessElements(int[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				count++;
			}
		}
		return count;
	}
	/////////////////////////////////////////////////////////////////////////////

	private static int lengthIncreasingArray(int[] arr) {
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= arr[i - 1]) {
				count++;
			}
		}
		return count;
	}
	//////////////////////////////////////////////////////////////////////////////

	public static void printResult(int a, int b) {
		
		System.out.println("Number Excess Elements " + a + "\n");
		System.out.println("length Increasing Array " + b + "\n");

	}
	///////////////////////////////////////////////////////////////////////////////

	public static void creatingIncreasingArray(int[] ar, int[] arr) {
		arr[0] = ar[0];

		for (int i = 1, j = 1; i < ar.length; i++) {
			if (ar[i] >= ar[i - 1]) {
				arr[j] = ar[i];
				j++;
			}
		}
	}

}
