package q126;

import java.util.Scanner;

abstract class Numbers {
	int odd;
	int even;

	public abstract void counting();
}

class Libra extends Numbers {

	@Override
	public void counting() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int num = sc.nextInt();
			if (num > 0 && num % 2 == 1) {
				odd++;
			} else if (num > 0 && num % 2 == 0) {
				even++;
			}

			if (num == 0) {
				sc.close();
				break;
			}
		}
		System.out.printf("odd : %d\neven : %d", odd, even);
	}
}

public class Main {
	public static void main(String[] args) {
		Libra oddEven = new Libra();

		oddEven.counting();
	}
}
/*
 * Q: 0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
 *  	0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
 *  	홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * Input ex) 
 * 9 7 10 5 33 65 0
 * 
 * output ex)
 * odd : 5
 * even : 1
 */
