import java.util.Scanner;

public class methods{  
Scanner s = new Scanner(System.in); 
 
  public void setVal(){

    System.out.println("Enter your Name : "); 
    public  String name = s.nextString(); 
    System.out.println("Enter your age : "); 
    public int  age=s.nextInt(); 
    System.out.println("Enter your Semester :"); 
    public int  sem=s.nextInt(); 
    System.out.println("Enter your cgpa: "); 
    public float cgpa=s.nextFloat(); 
 } 
  public void printVal(){ 
    System.out.println("Your Name is :" + setVal.name + "\nYour Age is : " + 
    setVal.age +"\n you are in Sem :" + setVal.sem + "\nyour cgpa : " + setVal.cgpa); 
  } 
}
   public static void main(String []args){ ; 
   method();
 }
