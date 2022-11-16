package q574;

import java.util.Scanner;

public class Tutor02 {
	public int maxFunc(int[] ar) { // ar = inp;
		int max = -1;
		for (int i=0; i<ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[3];
		for (int i=0; i<inp.length;i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		
//		for (int i=0; i<inp.length; i++) {
//			System.out.println(inp[i] + " ");			
//		}

		Tutor02 m = new Tutor02();
		int ret = m.maxFunc(inp);
		System.out.println(ret);
	}
}
