package q573;

import java.util.Scanner;

public class Tutor {
	public void rectangle(int p) {
		int c = 1;
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print(c++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		Tutor t = new Tutor();
//		Tutor(), Tutor method를 선언하는 이유
//		public void rectangle() {}에서 public과 void 안에 static이 없으면,
//		Tutor class 내 선언한 method를 이용하기 위해 별도의 인스턴스를 선언해줘야 한다
//		그래서 Tutor class의 method인 Tutor()를 선언하는 것이다.
		t.rectangle(n);
	}

}
