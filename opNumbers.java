import java.util.Scanner;

public class opNumbers{
    static int digSum(int num){
        int sum = 0;
        while(num>0 || sum >9){
            if (num ==0){
                num = sum;
                sum = 0;
            }
            sum  += num%10;
            num /= 10;
        }
        return sum;
    }
    
    static int sumOfDigits(int num){
        if(num ==0){
            return 0;
        }
            return( num % 10 + sumOfDigits(num/10));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a  number :");
        int num = s.nextInt();
        System.out.println("Sum of digits = " + sumOfDigits(num));
        System.out.println("Sum of digits as single digit = " + digSum(num));
    }
}