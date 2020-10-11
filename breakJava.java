import java.util.Scanner;

public class breakJava{

     public static void main(String []args){
         Scanner s = new Scanner(System.in);
         for(int i = 0; i < 20; i++)
         {
         System.out.print("Enter random numbers below 10 : ");
         int num = s.nextInt();
         // when 6 is read program wil stop reading numbers
         if(num == 6)
         {
             System.out.println("Program will now stop reading input!");
             break;
         }
         }
     }
}