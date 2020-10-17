package phunguyen;

public class SelectionSort {
	public void selectionSort(int arr[]) {
		int indexMin;
		// duyet qua tat ca cac so
		for (int i = 0; i < arr.length - 1; i++) {
			// cai dat phan tu hien tai la min
			indexMin = i;
			// kiem tra phan tu hien tai co phai nho nhat khong
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[indexMin]) {
					indexMin = j;
				}
			}
			if (indexMin != i) {
				System.out.println("==> Trao đổi phần tử: [" + arr[i] + "," + arr[indexMin] + "]");
				// trao doi cac so
				int temp = arr[indexMin];
				arr[indexMin] = arr[i];
				arr[i] = temp;
			}
			System.out.println("Vòng lặp thứ " + (i + 1));
			display(arr);
		}
	}

	public void display(int arr[]) {
		System.out.print("[");
		// duyet qua tat ca cac phan tu
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}

		System.out.print("]\n");
	}

	public static void main(String[] args) {
		// khoi tao mang arr
		int arr[] = { 2, 1, 6, 9, 3, 7, 5, 4, 8 };

		SelectionSort select = new SelectionSort();
		System.out.println("Mảng dữ liệu đầu vào");
		select.display(arr);
		System.out.println("*********************");
		select.selectionSort(arr);
		System.out.println("*********************");
		System.out.println("Mảng dữ liệu sau khi đã sắp xếp");
		select.display(arr);

	}
}
