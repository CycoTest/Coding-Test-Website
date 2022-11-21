package q525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rN[] = new int[3];
		for (int i = 0; i < rN.length; i++) {
			rN[i] = sc.nextInt();
		}
		sc.close();
		
		if (rN[0] > rN[1]) {
			if (rN[0] > rN[2]) {
				System.out.println("true");
			}
		} else if (rN[0] < rN[1] && rN[0] < rN[2]) {
			System.out.println("false");
		} 
		
		if (rN[0] == rN[1]) {
			if (rN[0] == rN[2]) {
				System.out.println("false");
			}
		} else {
			System.out.println("false");
		}
	}
}
/*
 * Q: 3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 
 * 		세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
 * 		(JAVA는 1이면 true, 0이면 false를 출력한다.)
 * 
 * input ex) 10 9 9
 * 
 * output ex) 1 0
 */
