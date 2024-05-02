import java.io.*;
class Count
{
	public static void main(String args[]) throws IOException
	{
		int ch;
		boolean prev = true;
		int char_count = 0;
		int word_count = 0;
		int line_count = 0;
		FileInputStream fin = new FileInputStream("textcount.txt");
		while((ch=fin.read())!=-1)
		{
			if(ch!=' ')
			{
				char_count++;
			}
			if(!prev && ch==' ')
			{
				word_count++;
			}
			if(ch == ' ')
			{
				prev = true;
			}
			else
			{
				prev = false;
			}
			if(ch=='\n')
			{
				line_count++;
			}
		}
		char_count-=line_count*2;
		word_count +=line_count;
		System.out.println("No of characters: "+char_count);
		System.out.println("No of words: "+word_count);
		System.out.println("No of lines: "+line_count);

		fin.close();
	}
}