package q556;

public class Main_for_repeat03 {
	public static void main(String[] args) {
		int[] rN = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//		1. for문
		for (int i = 0; i < rN.length; i++) {
			System.out.print(rN[i] + " ");
		}

		System.out.println();

//		2. while문
		int j = 0;
		while (j < rN.length) {
			System.out.print(rN[j] + " ");
			j++;
		}

		System.out.println();

//		3. do-while문
		int k = 0;
		do {
			System.out.print(rN[k] + " ");
			k++;
		} while (k < rN.length);
	}
}
