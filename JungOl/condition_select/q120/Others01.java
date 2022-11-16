package q120;

import java.util.Scanner;

public class Others01 {
	int output(int n1, int n2) {
		return ((n1 > n2) ? n1 : n2) - ((n1 < n2) ? n1 : n2);
	}

	public static void main(String[] args) {
		Others01 ref1 = new Others01();
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		System.out.println(ref1.output(inp1, inp2));
	}
}
