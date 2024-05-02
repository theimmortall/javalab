import java.io.*;
import java.net.*;

class Server1{
    public static void main(String args[]) throws Exception{
        ServerSocket ss = new ServerSocket(777);
        Socket s = ss.accept();
        System.out.println("Connection Established");
        OutputStream obj = s.getOutputStream();
        PrintStream ps = new PrintStream(obj);
        String str = "Hello Client";
        ps.println(str);
        ps.println("bye");
        ps.close();
        s.close();
        ss.close();
    }
}
