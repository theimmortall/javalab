import java.util.Scanner;

class cmpstr
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first string:");
    String str1 = sc.nextLine();
    System.out.println("Enter second string:");
    String str2 = sc.nextLine();
    if(str1.equals(str2))
    //if(str1==str2)
    {
      System.out.println("String 1 and String 2 are same");
    }
     else{
      System.out.println("String 1 and String 2 are not same");
    }
  }
}