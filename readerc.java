import java.io.*;

class readerc{
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = null;
        try{
            fr = new FileReader("rtext.txt");
        }
        catch(FileNotFoundException fe){
            System.out.println("File not found");
            return ;
        }

        while((ch = fr.read())!=-1){
            System.out.print((char)ch);
            
        }
        fr.close();
    }
}