package q557;
import java.util.Scanner;

public class Main_another02 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      char[] arr=new char[10];
            
      for(int i=0;i<10;i++) {
         arr[i]=sc.next().charAt(0);
         
         if(!(i%3==0 && i!=9)) 
         continue;
         
         System.out.print(arr[i]+" ");
      }
      sc.close();
   }
}