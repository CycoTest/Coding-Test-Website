package q524;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		int a = n1 & n2;
		int b = n1 | n2;
		boolean c = (a != 0);
		boolean d = (b != 0);
		
		System.out.print(c + " ");
		System.out.println(d);
	}
}
/*
논리 연산자
	- 논리 부정 : NOT, !
		ex) a !=0 : a가 0이 아닐 때
	
	- 논리곱 : AND, &, &&
	- 논리합 : OR, |, || (\키 위 기호)
*/