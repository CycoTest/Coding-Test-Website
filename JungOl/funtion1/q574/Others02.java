package q574;

import java.util.Scanner;

public class Others02 {
	int output(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				if (ar[j] < ar[j + 1]) {
					int tmp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = tmp;
				}
			}
		}
		return ar[0];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Others02 ref1 = new Others02();
		int[] ar = new int[3];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(ref1.output(ar));
	}
}