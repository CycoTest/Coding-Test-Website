package q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avgClass[] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		String num = sc.next();
		double sum = 0.0, avg = 0;
		for (int i = 0; i >= 0 && i < avgClass.length;) {
			int classNum = Integer.parseInt(num);
			i = classNum - 1;
			sum += avgClass[i];

			if (num == "") {
				sc.close();
				break;
			}
		}

		avg = sum / 2;
		System.out.printf(".2f", avg);
	}
}