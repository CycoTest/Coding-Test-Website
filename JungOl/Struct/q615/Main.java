package q615;

import java.util.Scanner;

class Converter {
	Scanner sc = new Scanner(System.in);
	private Info[] score;

	public Converter() {
		score = new Info[2];
		for (int i = 0; i < score.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();

			score[i] = new Info(name, kor, eng);
		}
		System.out.println(score);
	}

	public int getAvgKor() {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i].getKor();
		}
		return sum / score.length;
	}

	public int getAvgEng() {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i].getEng();
		}
		return sum / score.length;
	}

	public void printAvg() {
		System.out.printf("avg %d %d\n", getAvgKor(), getAvgEng());
	}
}

class Info {
	private String name;
	private int kor;
	private int eng;

	public Info(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void print() {
		System.out.printf("%s %d %d", name, kor, eng);
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

}

public class Main {
	public static void main(String[] args) {
		Converter cvtr = new Converter();
		cvtr.printAvg();
	}
}
