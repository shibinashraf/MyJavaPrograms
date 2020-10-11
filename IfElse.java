import java.util.Scanner;

public class IfElse{

     public static void main(String []args){
         Scanner s = new Scanner(System.in);

         System.out.println("Enter Your Average Mark out of 50 :");
         int AvgMark = s.nextInt();

         if ( AvgMark > 40 ) {
         System.out.println("Good Mark!");
         }
         else {
           System.out.println("Need Improvement.");
         }
     }
}