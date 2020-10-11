import java.util.*; 
public class Student{ 
  String name ; 
  int age,sem; 
  float cgpa; 
 Scanner sc = new Scanner(System.in); 
 
 public void setVal(){ 
 System.out.print("Enter your name :"); 
    name = sc.nextLine(); 
 System.out.print("Enter your age :"); 
    age = sc.nextInt(); 
 System.out.print("Enter your Semester :");  
    sem = sc.nextInt(); 
 System.out.print("Enter your cgpa :"); 
    cgpa = sc.nextFloat(); 
 } 
 public void printVal(){ 
 System.out.println("Your Name :" + name + "\nYour Age : " + 
age +"\nYou are in Semester:" + sem + "\nYour cgpa : " + cgpa); 
 } 
 public static void main(String []args){ 
 Student s = new Student(); 
 s.setVal(); 
 s.printVal(); 
 } 
 }