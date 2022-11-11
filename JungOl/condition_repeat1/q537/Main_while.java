package q537;

import java.util.Scanner;

public class Main_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumRange = sc.nextInt();
		sc.close();
		
//		System.out.println(SumRange);
		
		int sum = 0 ,baseNum = 1;
		while (baseNum <= sumRange) {
			sum += baseNum++;
		} 
		System.out.println(sum);
	}
}
