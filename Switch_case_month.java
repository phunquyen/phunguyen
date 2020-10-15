package phunguyen;

import java.util.Scanner;

class Switch_case_month {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int thang, nam;
		do {
			System.out.println("Nhập vào tháng bất kỳ: ");
			thang = scan.nextInt();
		} while (!(thang >= 1 && thang < 12));
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("tháng " + thang + " có 31 ngày!");
			break;
		case 2:
			System.out.println("Nhập vào năm bất kỳ: ");
			nam = scan.nextInt();
			if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
				System.out.printf("tháng " + thang + " năm " + nam + " có 29 ngày! (năm nhuận)");
			} else {
				System.out.printf("tháng " + thang + " năm " + nam + " có 28 ngày!");
			}
			break;
		default:
			System.out.println("tháng " + thang + " có 30 ngày!");
		}
	}
}
