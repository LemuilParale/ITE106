import java.io.File;
import java.util.Scanner;
public class TextFileManipulationfileReader
{
	public Static viod main(String[]args) throws Exception
	{
		File file = new File("LemuilParale.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
			System.out.print(sc.NextLine());
	}
}