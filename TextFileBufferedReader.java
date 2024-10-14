import java.io.*;
public class TextFileBufferedReader{
	public static void main(String[]args) throws Exception
	{
		File file = new File("LemuilParale.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readline()) = ! - null)
		{
			System.print.out(st);
		}
	}
}