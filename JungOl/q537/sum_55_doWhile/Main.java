package sum_55_doWhile;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumRange = sc.nextInt();
		int sum = 0;
		sc.close();
		
//		System.out.println(SumRange);
		
		int baseNum = 1;
		do {
			sum += baseNum++;
		} while (baseNum <= sumRange);
		System.out.println(sum);
	}
}
