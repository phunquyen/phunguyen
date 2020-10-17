package phunguyen;

public class QuickSort {
	public void swap(int arr[], int num1, int num2) {
		int temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
	}
	
	public int devide(int arr[], int left, int right, int pivot) {
		int leftPointer = left -1 ;
		int rightPointer = right;
		
		while(true) {
			while(arr[++leftPointer] < pivot) {
				
			}
			
			while(rightPointer > 0 && arr[--rightPointer] > pivot) {
				
			}
			
			if(leftPointer >= rightPointer) {
				break;
			} else {
				System.out.println("Phần tử được trao đổi: " +arr[leftPointer]+ ", " +arr[rightPointer]);
				swap(arr, leftPointer, rightPointer);
			}
		}
		System.out.println("Phần tử chốt được trao đổi: " + arr[leftPointer] + ", " + arr[right]);
		swap(arr, leftPointer, right);
		display(arr);
		return leftPointer;
	}
	
	public void quickSort(int arr[], int left, int right) {
		if(right - left <= 0) {
			return;
		}
		else {
			int pivot = arr[right];
			int dividePoint = devide(arr, left, right, pivot);
			quickSort(arr, left, dividePoint -1);
			quickSort(arr, dividePoint +1, right);
		}
	}
	
	public void display(int arr[]) {
		int i;
		System.out.print("[");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]\n");
	}
	
	public static void main(String[] args) { 
		int arr[] = { 2, 1, 6, 9, 3, 7, 5, 4, 8 };
		QuickSort quick = new QuickSort();
		System.out.println("Mảng dữ liệu đầu vào");
		quick.display(arr);
		System.out.println("*****************");
		quick.quickSort(arr, 0, arr.length - 1);
		System.out.println("*****************");
		System.out.println("Mảng sau khi sắp xếp");
		quick.display(arr);
		
	}
}
