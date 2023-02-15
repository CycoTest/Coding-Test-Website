package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dwarf[] = new int[9];
		int sum = 0;
		int man1 = 0; // 일곱 난쟁이가 아닌 애
		int man2 = 0; // 일곱 난쟁이가 아닌 애
		
		for (int i = 0; i < dwarf.length; i++) {
			dwarf[i] = scan.nextInt();
			sum += dwarf[i];
		}

		for (int i = 0; i < dwarf.length - 1; i++) {
			for (int j = i; j < dwarf.length; j++) {
				if (sum - dwarf[i] - dwarf[j] == 100 && i != j) {
					man1 = i;
					man2 = j;
					break;
				}
			}
		}

		for (int i = 0; i < dwarf.length; i++) {
			if (i == man1 || i == man2)
				continue;
			System.out.println(dwarf[i]);
		}
		scan.close();
	}
}