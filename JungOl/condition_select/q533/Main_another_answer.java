package q533;

import java.util.Scanner;

public class Main_another_answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();
		
		if (c == 'M') {
		// 비트 연산자를 하기 위해, 문자 타입을 char 타입으로 함
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else {
			if (age >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		}
	}
}
