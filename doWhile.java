import java.util.Scanner;

public class doWhile{

     public static void main(String []args){
         int i = 0,sum =0;
         do{
             sum = sum+i;
             i++;
         }while(i<=10);
System.out.println("Sum of numbers upto 10 = " + sum );
     }
}