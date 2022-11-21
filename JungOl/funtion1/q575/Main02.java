package q575;

import java.util.Scanner;

public class Main02 {
	
	void fullfil(int rN[]) {
		int result = 1;
		for (int i = 0; i < rN[rN.length -1]; i++) {
			result *= rN[0];
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rN[] = new int[2];
		for (int i = 0; i < rN.length; i++) {
			rN[i] = sc.nextInt();
		}
		sc.close();
		
		Main02 overT = new Main02();
		overT.fullfil(rN);
	}
}
/*
 * Q: 10 이하의 두 정수가 주어진다.
 * 		이를 입력 받아서 첫 번째 수를 두 번째 수만큼 거듭제곱하여 나온 값을 리턴하는 함수를 작성하여 
 * 		다음과 같이 출력하는 프로그램을 작성하시오.
 * 
 * input ex) 2 10
 * 
 * output ex) 1024
 */
