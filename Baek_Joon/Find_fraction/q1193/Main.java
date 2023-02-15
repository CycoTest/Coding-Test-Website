package q1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		in.close();

		int sum[] = new int[x];
		int line[] = new int[x];
		for (int i = 0; i < x; i++) {
			sum[i] += i + 1;
			line[i] = i + 1;
		}

		for (int i = 0;;) {
			if (x >= line[i] && x <= sum[i]) {
				if (line[i] % 2 == 0) {
					int top = line[i] + x - sum[i];
					int bottom = 1 + sum[i] - x;
					System.out.printf("%d / %d \n", top, bottom);
					break;
				} else {
					int top = 1 + sum[i] - x;
					int bottom = line[i] + x - sum[i];
					System.out.printf("%d / %d \n", top, bottom);
					break;
				}
			} else {
				continue;
			}
		}
		System.out.println();
	}
}
		
/*		
 * 		분자 = 1 + 라인 최종수 - 내 번호
		분모 = 라인 번호 + 내 번호 - 라인 최종수
		
		line + 1 = 분자 + 분모
		1/1(1)
		1/2(2) 2/1(3)
		3/1(4) 2/2(5) 1/3(6)
		1/4(7) 2/3(8) 3/2(9) 4/1(10)
		5/1    4/2    3/3    2/4      1/5
		
		
*/		
		

/*
 * Q: 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 
 * 		지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * 
 * 		X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 * 
 * input form)
 * 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 * 
 * output form)
 * 첫째 줄에 분수를 출력한다.
 * 
 * input / output ex)
 * 1 / 1/1
 * 2 / 1/2
 * 3 / 2/1
 * 4 / 3/1
 * 5 / 2/2
 * 6 / 1/3
 * 7 / 1/4
 * 8 / 2/3
 * 9 / 3/2
 * 14 / 2/4
 * 
 */
