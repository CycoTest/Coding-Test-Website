package q574;

import java.util.Scanner;

public class Tutor01 {
	public int maxFunc(int p1, int p2, int p3) {
		int max = 0;
		
		if (p1 > p2) {
			if (p1 > p3) {
				max = p1;
			} else {
				max = p3;
			}
		} else {
			if (p2 > p3) {
				max = p2;
			} else {
				max = p3;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

		System.out.println(n1 + " " + n2 + " " + n3);

		Tutor01 m = new Tutor01();
		int ret = m.maxFunc(n1, n2, n3);
		System.out.println(ret);
	}
}
