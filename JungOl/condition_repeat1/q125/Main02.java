package q125;

import java.util.Scanner;

public class Main02 {
	int num;
	
	void lineUp() {
		for (int i = 0; i < num; i++) {
			int result = i + 1;
			System.out.print(result + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main02 arrange = new Main02();
		arrange.num = sc.nextInt();
		sc.close();
		
		arrange.lineUp();
	}
}
