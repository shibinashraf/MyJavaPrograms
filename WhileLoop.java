import java.util.Scanner;

public class WhileLoop{

     public static void main(String[] args){
         Scanner s = new Scanner(System.in);

         System.out.println("Enter the Limit :");
         int Limit = s.nextInt();
         int i = 0, sum = 0;
         while(i<=Limit) {
           sum = sum+i;
           i++;
         }
         System.out.println("Sum of numbers upto "+Limit + " = " + sum);
         }

     }