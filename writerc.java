import java.io.*;

class writerc {
    public static void main(String[] args) throws IOException {
        String str = "This is a book on java" +
                "\nI am a learner of java.";
        FileWriter fw = new FileWriter("writertext.txt");
        for(int i =0;i<str.length();i++){
            fw.write(str.charAt(i));
        }
        fw.close();
    }
}