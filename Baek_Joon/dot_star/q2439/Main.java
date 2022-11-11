package q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N = 지정 횟수
		sc.close();

		for (int r = 0; r < N; r++) { // r = row
			int c1 = 1; // c1 = column1
			do {
				if (r == N -1) {
						break;
				}	
				System.out.print('?');
				c1++;
			} while (c1 < N - r);
//			' '을 출력하는 반복문
			
			int c2 = 0; // c2 = column2
			do {				
				System.out.print('*');
				c2++;
			} while (c2 <= r);
//			'*'를 출력하는 반복문
			System.out.println();
		}
	}
}
/*
 * 바깥 for문 = 행
 * 안쪽 for문 = 열
 */
