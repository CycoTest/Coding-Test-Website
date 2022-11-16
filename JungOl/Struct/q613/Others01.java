package q613;

import java.util.Scanner;

class Information {
   private String name;
   private String school;
   private int grade;

   public void set(String x, String y, int z) {
      this.name = x;
      this.school = y;
      this.grade = z;
   }

   public String getName() {
      return name;
   }

   public String getSchool() {
      return school;
   }

   public int getGrade() {
      return grade;
   }
}

public class Others01 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String inp1 = sc.next();
      String inp2 = sc.next();
      int inp3 = sc.nextInt();
      sc.close();

      Information inf = new Information();
      inf.set(inp1, inp2, inp3);

      System.out.printf("Name : %s\n", inf.getName());
      System.out.printf("School : %s\n", inf.getSchool());
      System.out.printf("Grade : %d", inf.getGrade());

   }
}