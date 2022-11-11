package q539;

import java.util.Scanner;

public class Main_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int count = 0;
		int sum = 0;
		float avg = 0.0f;
		while (num < 100) {
			num = sc.nextInt();
			count++;
			sum += num;
		}
		sc.close();
		avg = (float)sum / (float)count;
		
		System.out.printf("%d\n%.1f", sum, avg);
	}
}
