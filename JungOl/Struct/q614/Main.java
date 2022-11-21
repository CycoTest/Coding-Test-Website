package q614;

import java.util.Scanner;

class Info {
	String schoolName;
	int gradeNo;

	void starter() {
		String schoolName00 = "Jejuelementary";
		int gradeNo00 = 6;
		System.out.printf("%d grade in %s School\n", gradeNo00, schoolName00);
	}

	void list(String school, int grade) {
		schoolName = school;
		gradeNo = grade;
		System.out.printf("%d grade in %s School\n", gradeNo, schoolName);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Info sg = new Info();
		
		sg.schoolName = sc.next();
		sg.gradeNo = sc.nextInt();
		sc.close();

		sg.starter();
		sg.list(sg.schoolName, sg.gradeNo);
	}
}
/*
 * Q: "학교명", "학년"을 저장할 수 있는 구조체로 2개의 변수를 선언한 후, 
 *  	한 개의 변수는 학교명에 "Jejuelementary", 학년에 "6"으로 각각 초기화하고 
 *  	다른 변수에는 새로운 학교와 학년을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.
 * 
 * input : Seogwipomiddle  1
 * 
 * output: 
 * 6 grade in Jejuelementary School //초기화한 것
 * 1 grade in Seogwipomiddle School //입력받은 것
 */
