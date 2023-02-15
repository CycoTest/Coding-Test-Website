package q1193;

import java.util.Scanner;

public class fraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		int last = 0;
		int line = 0;
		while (true) {
			line++;
			last += line;
			if (last >= x) {
				if (line % 2 == 0) {
					System.out.println(x - last + line + "/" + (last - x + 1));
				} else {
					System.out.println((last - x + 1) + "/" + (x - last + line));
				}
				break;
			}
		}
	}
}
