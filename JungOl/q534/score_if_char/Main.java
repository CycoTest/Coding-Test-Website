package score_if_char;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char aWord = sc.next().charAt(0);
		sc.close();
		
//		System.out.println(AWord);
		
		if (aWord=='A') {
			System.out.println("Excellent");
		} else if (aWord=='B') {
			System.out.println("Good");
		} else if (aWord=='C') {
			System.out.println("Usually");
		} else if (aWord=='D') {
			System.out.println("Effort");
		} else if (aWord=='F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}		
	}
}
/*
 * String 타입으로 할 경우,
 * 
 * 조건문에 AWord=="A" 라고 하면 인식이 잘 안 됨
 * 	- AWord.equals("A") 라고 해야 인식이 잘 됨
 * 	-> equals()가 문자열 타입일 때 쓰는 method 명령어
 */

/*
 * 커리큘럼
 * 
 * 전반기
 * 	- java
 * 	- DB
 * 	+ Project 1 (개인) : PC App
 * 
 * 후반기
 * 	- HTML + CSS
 * 	- JavaScript
 * 	- JSP
 * 	+ Project 2 (팀) : Web
 * 	- Android
 * 	- Spring
 * 
 * ===============================
 * Android (OS) structure
 * 
 * APP : Java 기반 -> kotlin 언어로 바뀌어가는 추세
 * Android Framework : Java, C, C++ 기반
 * Linux kernel : C 언어 기반
 * 
 * Apple (iOS) Language
 * 
 * Object C -> Swift
 */

