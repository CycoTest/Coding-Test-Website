package q540;

import java.util.Scanner;

public class Main02 {
	Scanner sc = new Scanner(System.in);
	int num;
	
	void doWhile() {
		do {
			num = sc.nextInt();
			if ((num % 3) == 0) {
				System.out.println(num/3);
			} 
		} while(num == -1);
		sc.close();
	}
	
	public static void main(String[] args) {
		Main02 tT = new Main02(); // tT = three Times, 3의 배수
	
		tT.doWhile();
	}
}
