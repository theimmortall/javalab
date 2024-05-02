import java.io.*;
class readstream
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin = new FileInputStream("myfile.txt");
		System.out.println("File Contents:");
		int ch;		
		while((ch=fin.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fin.close();
	}
}