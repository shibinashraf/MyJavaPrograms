import java.util.Scanner;

public class SimpleIf{

     public static void main(String []args){
         Scanner s = new Scanner(System.in);

         System.out.println("Enter a number :");
         int num = s.nextInt();
         if(num>0) {
         System.out.println("It is a positive Integer!");
         }
     }
}