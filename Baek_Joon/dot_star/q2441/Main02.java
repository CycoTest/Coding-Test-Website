package q2441;

import java.util.Scanner;

public class Main02 {
	int rN = 0;

	private void count() {
		Scanner sc = new Scanner(System.in);
		rN = sc.nextInt();
		sc.close();
	}

	public void round() {
		count();
		
		for (int i = 0; i < rN; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			
			for (int j = 0; j < rN - i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main02 stars = new Main02();

		stars.round();
	}
}
/*
 * Q: 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 * 
 * input ex)
 * 5
 * output ex)
 * *****
 * 	****
 * 	 ***
 *    **
 *     *
 * 
 * input form)
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * output form)
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 */
