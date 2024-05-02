import java.io.*;
class buffer
{
   public static void main(String args[]) throws IOException
   {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter Username:");
     String str = br.readLine();
     System.out.println("Enter Password:");
     int in = Integer.parseInt(br.readLine());
     System.out.println("User data Entered successfully");
     System.out.println("UserName:"+str);
     System.out.println("Password:"+in); 
    }
}