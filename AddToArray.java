package phunguyen;

import java.util.Scanner;

public class AddToArray {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhập số phần tử của mảng: ");
		int number = scan.nextInt();
		int[] arr = new int[number];
		System.out.print("Nhập các phần tử của mảng: \n");
		for (int i = 0; i < number; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = scan.nextInt();
		}
		System.out.print("Nhập phần tử k = ");
		int k = scan.nextInt();
		
		sortASC(arr);
		System.out.print("Sắp xếp mảng tăng dần: ");
		show(arr);
		System.out.printf("\nChèn phần tử " + k + " vào mảng");
		arr = insert(arr, k);
		System.out.print("\nMảng sau khi chèn: ");
		show(arr);
	}

	public static void sortASC(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static int[] insert(int[] arr, int k) {
		int arrIndex = arr.length - 1;
		int tempIndex = arr.length;
		int[] tempArr = new int[tempIndex + 1];
		boolean inserted = false;

		for (int i = tempIndex; i >= 0; i--) {
			if (arrIndex > -1 && arr[arrIndex] > k) {
				tempArr[i] = arr[arrIndex--];
			} else {
				if (!inserted) {
					tempArr[i] = k;
					inserted = true;
				} else {
					tempArr[i] = arr[arrIndex--];
				}
			}
		}
		return tempArr;
	}

	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
