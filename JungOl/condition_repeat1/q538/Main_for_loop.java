package q538;

import java.util.Scanner;

public class Main_for_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("number? ");
			int num1 = sc.nextInt();
			
			if (num1 > 0) {
				System.out.println("positive integer");
			} else if (num1 <0) {
				System.out.println("negative integer");
			} else {
				sc.close();
				break;
			}
		}
		// 무한루프문을 빠져나가기 전에 scanner 기능을 닫고 나와야 함
	}
}
