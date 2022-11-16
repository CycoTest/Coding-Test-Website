package q574;

import java.util.Scanner;

public class Main_02 {
	static int rN[] = new int[3]; // rN = regular number
	static int num;

	int compare() { // method의 첫 글자는 소문자로 하는 게 관례이다
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < rN.length; i++) {
			if (max < rN[i]) {
				max = rN[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_02 main = new Main_02();

		for (int i = 0; i < rN.length; i++) {
			num = sc.nextInt();
			rN[i] = num;
//			System.out.print(rN[i] + " ");
		}
		sc.close();

		System.out.println(main.compare());
	}
}
