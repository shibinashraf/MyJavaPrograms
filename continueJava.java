public class continueJava{

     public static void main(String []args){
         System.out.println("Even numbers upto 10 are : ");
         for(int i = 1; i <=10 ; i ++ ){
            if( i % 2 == 0)
            System.out.println(i);
            else
            continue;
         }


     }
}