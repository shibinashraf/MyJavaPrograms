import java.util.Scanner;

public class ElseIfLadder{

     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

         System.out.println("Enter the Student's rank :");
         int rank = s.nextInt();

         if ( rank < 1000 ) {
         System.out.println("Flourishing!");
         }
         else if ( rank > 1000 && rank < 2000 ) {
         System.out.println("Blossoming!");
         }
         else if ( rank > 2000 && rank < 3000 ) {
         System.out.println("Flourishing!");
         }
         else {
           System.out.println("Sorry!");
         }
     }
}