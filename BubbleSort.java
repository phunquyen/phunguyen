package phunguyen;

public class BubbleSort {
	public void bubleSort(int arr[]) {
		int temp;
		boolean swapped = false;

		// lap qua tat ca cac so
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			// vong lap thu hai
			for (int j = 0; j < arr.length - 1; j++) {
				System.out.print("So sánh các phần tử: [" + arr[j] + ", " + arr[j + 1] + "]");
				// kiem tra so ke tiep, trao doi so
				// muc dich lam noi bot so lon nhat
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					swapped = true;
					System.out.println("=> trao doi [" + arr[j] + "," + arr[j + 1] + "]");
				} else {
					System.out.println("Không cần trao đổi");
				}
			}
			// mang da duoc sap xep va thoat khoi vong lap
			if (!swapped) {
				break;
			}
			System.out.println("Vòng lặp thứ: " + (i + 1));
			display(arr);
		}
	}
	
	public void display(int arr[]) {
		System.out.print("[");
		// duyet qua tat ca cac phan tu
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]\n");
	}
	
	public static void main(String[] args) {
		// khoi tao mang arr
		int arr[] = {2, 1, 6, 9, 3, 7, 5, 4, 8};
		BubbleSort bubble = new BubbleSort();
		System.out.println("Mảng dữ liệu đầu vào:");
		bubble.display(arr);
		System.out.println("****************");
		bubble.bubleSort(arr);
		System.out.println("*****************");
		System.out.println("Mảng sau khi sắp xếp:");
		bubble.display(arr);
	}
}
