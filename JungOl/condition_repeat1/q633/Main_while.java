package q633;

import java.util.Scanner;

public class Main_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		while (true) {
			num = sc.nextInt();
			System.out.println(num);
			sc.close();
		}
	}
}
