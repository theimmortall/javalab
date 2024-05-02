import java.io.*;
class writestream{
    public static void main(String args[]) throws IOException{
        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("myfile1.txt");
        System.out.println("Enter the text (@ at the end): ");
        char ch;

        while((ch = (char)dis.read())!='@')
        fout.write(ch);
        fout.close();
    }
}
