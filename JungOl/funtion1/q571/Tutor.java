package q571;

import java.util.Scanner;

public class Tutor {
	public static void printStr() {
		System.out.println("~!@#$^&*()_+|");
	}
//	메소드 선언부 : 6 ~ 8번 라인
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 전체 코드 실행 시행부
		int num = sc.nextInt();
		sc.close();

//		System.out.println(num);

		for (int i = 0; i < num; i++) {
			printStr();
		}
	}
//	메소드 호출부 : 19번 라인
}
/*
 * 인스턴스를 생성할 때는 반드시 'new'를 넣고, new (instance)로 메모리를 할당받고, 
 * Heap 영역에 할당받은 메모리 공간이 들어가야 해당 instance를 실행할 수 있다.
 * 
 * 헌데, public static void main() {} 에서 static이라는 키워드가 들어가면
 * 시스템 실행과 동시에 메모리를 할당받고 동시에 해당 시스템을 종료할 때까지 시행이 할 수 있는 상태가 된다.
 * 
 * 일반적인 Main 변수명 = new Main();를 public static void main() {} 아래에 넣어야 한다.
 * 
 */
