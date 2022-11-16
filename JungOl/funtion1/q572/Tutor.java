package q572;

import java.util.Scanner;

public class Tutor {
	public double calArea(int r) {
		double area = r*r*3.14;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		sc.close();
		
		Tutor main = new Tutor();
		System.out.printf(".2f", main.calArea(r));
	}

}
