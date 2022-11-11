package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char w[] = new char[10];
		
		for (int i=0; i<10; i++) {
//			char wx = sc.next().charAt(0);
//			w[i] = wx;
			
//			String s = sc.next();
//			w[i] = s.charAt(0);
			w[i] = sc.next().charAt(0);
		}
		sc.close();
		
		System.out.printf("%c %c %c", w[0], w[3], w[6]);
	}
}
