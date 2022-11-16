package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[10];
		int min = Integer.MAX_VALUE;

//		1. for문
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if (min>num[i]) {
				min = num[i];
			}
		}
		sc.close();
		System.out.println(min);
		
//		2. while문
		int j=0;
		while (j<num.length) {
			num[j] = sc.nextInt();
			if (min>num[j]) {
				min=num[j];
			}
		}
		sc.close();
		System.out.println();
		
//		3. do-while문
		int i = 0;
		do  {
			num[i] = sc.nextInt();
			if (min > num[i]) {
				min = num[i];
			}
			i++;
		} while (i < num.length);
		sc.close();
		
		System.out.println(min);
		
//		4. 삼항자
		
	}
}
