import java.util.Scanner;
import java.io.*;

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
};

class userdefexc{
    public static void main(String s[]){
         Scanner sc = new Scanner(System.in);
         try{
            System.out.println("Enter age:");
            int a = sc.nextInt();
            if(a<18){
                throw new MyException("Age is less than 18!");
            }
         }

         catch(MyException ex){
            System.out.println("Exception occured");
            System.out.println(ex.getMessage());
         }
    }
};
