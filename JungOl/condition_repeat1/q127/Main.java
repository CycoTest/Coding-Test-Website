package q127;

import java.util.Scanner;

class Input {
	int num;
	int count;
	int Num[];
	
	void repeat() {
		Scanner sc = new Scanner(System.in);
		int Num[] = new int[100];
		for (int i = 0; i < 100; i++) {
			num = sc.nextInt();
			if (num >= 0 && num <= 100) {
				this.Num[i] = num;
				count++;
			}

			if (num > 100) {
				sc.close();
				break;
			}
		}
	}
}

class Output extends Input {
	int sum;
	int avg;

	void Sigma() {
		for (int i = 0; i < 100; i++) {
			sum += Num[i];
		}
		System.out.println(sum);
	}

	void Average() {
		avg = sum / count;
		System.out.println(avg);
	}
}

public class Main {

	public static void main(String[] args) {
		Output count = new Output();
		
		count.Sigma();
		count.Average();
	}

}

/*
 * Q: 0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 그 이전까지 입력된 자료의 합계와 평균을 출력하는
 * 프로그램을 작성하시오. (평균은 반올림하여 소수 첫째자리까지 출력한다.)
 * 
 * input ex) 55 100 48 36 0 101
 * 
 * output ex) sum : 239 avg : 47.8
 * 
 */
