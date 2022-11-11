package q508;

public class Main_printf_string {
	public static void main(String[] args) {
		System.out.printf("%10s", "item");
		System.out.printf("%10s", "count");
		System.out.printf("%10s\n", "price");
		System.out.printf("%10s", "pen");
		System.out.printf("%10s", "20");
		System.out.printf("%10s\n", "100");
		System.out.printf("%10s", "note");
		System.out.printf("%10s", "5");
		System.out.printf("%10s\n", "95");
		System.out.printf("%10s", "eraser");
		System.out.printf("%10s", "110");
		System.out.printf("%10s", "97");
		
		System.out.println();
		System.out.printf("%10s%10s%10s\n", "item", "count", "price");
		System.out.printf("%10s%10d%10d\n", "pen", 20, 100);
		System.out.printf("%10s%10d%10d\n", "note", 5, 95);
		System.out.printf("%10s%10d%10d\n", "eraser", 110, 97);
	}
}
/*
 * 자주 사용되는 지시자
 * 
 * %d = decimal 10진수 정수형으로 출력
 * %f = float 소수점 형식으로 출력
 * %s = string 문자열 형식으로 출력
 * %c = char 문자 형식으로 출력
 * %n = 줄바꿈 지시자, 엔터/개행
 * %b = boolean 형식으로 출력
 *
 * 지시자 사용 형태
 * 
 * 각 지시작의 %뒤에 숫자/기호를 넣어 다양한 형식으로 출력
 * 	1) 숫자: (오른쪽 정렬) 출력할 최대 자릿수를 지정
 * 		ex) %3d : 최대 3자리의 정수를 출력하되, 다 출력하고 자리가 남으면 공백으로 채우고 오른쪽 정렬 후 출력
 * 	
 * 	2) 0 : (전체 자릿수가 지정된 경우) 출력하고 남은 자리를 공백 대신 0으로 채워 출력
 * 		ex) %03d : 최대 3자리의 정수를 출력하되, 다 출력하고 남은 자리에 공백 대신 0으로 채우고 오른쪽 정렬 후 출력
 * 	
 * 	3) - : (왼쪽 정렬) (전체 자릿수가 지정된 경우) 출력 후 남은 자리를 공백으로 채우고 왼쪽으로 정렬해 출력
 * 		ex) %-4s : 최대 4자리의 문자열을 출력하되, 다 출력하고 남은 자리는 공백으로 채우고 왼쪽 정렬하여 출력
 */