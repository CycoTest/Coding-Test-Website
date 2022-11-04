package sum_55_for;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumRange = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for(int i=1; i<=sumRange; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
