package phunguyen;

public class InsertionSort {
	public void insertionSort(int arr[]) {
		int valueToInsert;
		int insertPosition;
		int i;

		// duyet qua tat ca cac so
		for (i = 0; i < arr.length; i++) {
			// chon mot gia tri de chen
			valueToInsert = arr[i];
			// lua chon vi tri de chen
			insertPosition = i;

			// kiem tra so lien truoc co lon hon gia tri duoc chen khong
			while (insertPosition > 0 && arr[insertPosition - 1] > valueToInsert) {
				arr[insertPosition] = arr[insertPosition - 1];
				insertPosition--;
				System.out.println("Di chuyển phần tử: " + arr[insertPosition]);
			}
			if (insertPosition != i) {
				System.out.println("Chèn phần tử: " + valueToInsert + ", tại vị trí: " + insertPosition);
				// chen phan tu tai vi tri chen
				arr[insertPosition] = valueToInsert;
			}
			System.out.println("Vòng lặp thứ: " + i);
			display(arr);
		}
	}

	public void display(int arr[]) {
		System.out.print("[");
		// duyet qua tat ca phan tu
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		System.out.print("]\n");
	}

	public static void main(String[] args) {
		// khoi tao mang
		int arr[] = { 6, 9, 1, 3, 5, 4, 2, 7, 8 };
		InsertionSort sapXepChen = new InsertionSort();
		System.out.println("Mảng dữ liệu đầu vào: ");
		sapXepChen.display(arr);
		System.out.println("**********************");
		sapXepChen.insertionSort(arr);
		System.out.println("**********************");
		System.out.println("\nMảng sau khi sắp xếp: ");
		sapXepChen.display(arr);
	}
}