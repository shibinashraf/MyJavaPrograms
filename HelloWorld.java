import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
         Scanner s = new Scanner(System.in);

         System.out.println("Enter Your Phone Number :");
         long Pnum = s.nextLong();
         System.out.println("Your Phone Number is: " + Pnum);
     }
}
