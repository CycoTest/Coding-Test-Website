package q508;

public class Main_array_basic {
	public static void main(String[] args) {
		String[] str = {"item", "count", "price",
				"pen", "20", "100",
				"note", "5", "95",
				"eraser", "110", "97"};
		
		System.out.printf("%10s%10s%10s\n", str[0], str[1], str[2]);
		System.out.printf("%10s%10s%10s\n", str[3], str[4], str[5]);
		System.out.printf("%10s%10s%10s\n", str[6], str[7], str[8]);
		System.out.printf("%10s%10s%10s\n", str[9], str[10], str[11]);
		
		for (int i = 0; i <= 11; i++) {
			if ((i % 3) == 0 && i != 0) {
				System.out.printf("\n");
			}
			System.out.printf("%10s", str[i]);
		}
	}
}
