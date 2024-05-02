import java.io.*;
import java.net.*;

public class FileClient 
{
    public static void main(String[] args) throws Exception
    {
        Socket s = new Socket("localhost",8888);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter filename: ");
        String fname = kb.readLine();
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeBytes(fname + "\n");
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        
        String str;

        str =in.readLine();
        if (str.equals("Yes"))
        {
            while((str = in.readLine())!=null)
            {
                System.out.println(str);
            }   
            kb.close();
            out.close();
            in.close();
            s.close();
        }
        else
        {
            System.out.println("File not found");
        }
    }    
}
