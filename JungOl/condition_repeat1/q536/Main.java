package q536;

public class Main {
	public static void main(String[] args) {
		
		// 1. for loop
		for (int i = 1; i <= 15; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		// 2. while loop
		int j = 1;
		while (j <= 15) {
			System.out.print(j++ +" ");
		}
		
		// 3. do-while loop
		int k = 1;
		do {
			System.out.print(k++ + " ");
		} while (k <= 15);
	}
}
