package compare_min2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
//		System.out.println(regulNum1 + " " + regulNum2 + " " + regulNum3);
		
/*
 *  조건 연산자: (조건식) ? A : B = 조건식에 따라 A 또는 B 중 하나를 선택
 *  
 *  ex) min = (a < b) ? a : b;
 *  	1) a < b가 true일 경우 => min = a
 *  	2) a < b가 false일 경우 => min = b
 */
		int min = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
		System.out.println(min);
	}
}
