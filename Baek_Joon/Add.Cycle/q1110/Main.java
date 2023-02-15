package q1110;

import java.util.Scanner;

class Range {
	private int primary;

	private void rangeCheck() {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();

		if (0 <= num && num <= 99) {
			primary = num;
		}
	}

	public int[] getDigit() {
		rangeCheck();
		int digit[] = new int[2];
		digit[0] = primary / 10;
		digit[1] = primary % 10;

		return digit;
	}

	public int getPrimary() {
		return primary;
	}
}

class Cycle {
	private int times;

	private void findCycle() {
		Range num = new Range();
		int[] digiT = num.getDigit();
		int[] one = new int[3];

		for (int i = 0; i < digiT.length; i++) {
			one[i] = digiT[i];
		}

		int sumDigit = 0;

		for (;;) {
			for (int i = 0; i < one.length - 1; i++) {
				sumDigit += one[i];
				one[one.length - 1] = sumDigit;
			}
			times++;
			one[0] = one[1];
			one[1] = sumDigit % 10;
			sumDigit = 0;

			if (num.getPrimary() == (one[0] * 10 + one[1])) {
				break;
			}
		}
	}

	public int getTimes() {
		findCycle();
		return times;
	}
}

public class Main {
	public static void main(String[] args) {
		Cycle uroborus = new Cycle();

		System.out.println(uroborus.getTimes());
	}
}
/*
 * Q: 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
 * 		먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 
 * 		각 자리의 숫자를 더한다. 
 * 
 * 		그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 
 * 		구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 
 * 		
 * 		다음 예를 보자.
 * 		26부터 시작한다. 
 * 		2+6 = 8이다. 새로운 수는 68이다. 
 * 		6+8 = 14이다. 새로운 수는 84이다. 
 * 		8+4 = 12이다. 새로운 수는 42이다. 
 * 		4+2 = 6이다. 새로운 수는 26이다.
 * 
 * 		위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 * 
 * 		N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 * 
 * input form)
 * 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 * 
 * output form)
 * 첫째 줄에 N의 사이클 길이를 출력한다.
 * 
 * input/output ex)
 * 26 / 4
 * 55 / 3
 * 1 / 60
 * 0 / 1
 * 71 / 12
 * 
 * 
 */
