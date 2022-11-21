package q540;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			num = sc.nextInt();
			
			if ((num % 3) == 0) {
				int result = num / 3;
				System.out.println(result);
			} else if (num == -1) {
				break;
			} else {
				continue;
			}
		} while (true);
		sc.close();
	}
}
