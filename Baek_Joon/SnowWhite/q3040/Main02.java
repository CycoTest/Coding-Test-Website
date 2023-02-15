package q3040;

import java.util.Scanner;

public class Main02 {
	static int[] dwarf = new int[9];
	static int[] snowPick = new int[7];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < dwarf.length; i++) {
			dwarf[i] = scan.nextInt();
		}
		combination(0, 0);
		scan.close();
	}

	private static void combination(int start, int count) {
		if (count == 7) {
			int sum = 0;

			for (int num : snowPick) {
				sum += num;
			}

			// 합이 딱 100이면 현재 뽑은 7명의 번호를 출력
			if (sum == 100) {
				for (int num : snowPick) {
					System.out.println(num);
				}
			}
			return;
		}

		for (int i = start; i < 9; i++) {
			snowPick[count] = dwarf[i];
			combination(i + 1, count + 1);
		}
	}
}