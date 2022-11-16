package q613;

import java.util.Scanner;

class Student {
	private String Name;
	private String School;
	private int Grade;
	
	public void Info() {
		System.out.println("Name : " + Name);
		System.out.println("School : " + School);
		System.out.println("Grade : " + Grade);
	}
	
	public Student(String name, String school, int grade) {
		this.Name = name;
		this.School = school;
		this.Grade = grade;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student person1 = new Student(name, school, grade);
		
		person1.Info();
	}
}
// input : Songjunhyuk Beolmal 6
/*
 * output :
 * Name : Songjunhyuk 
 * School : Beolmal 
 * Grade : 6
 */
