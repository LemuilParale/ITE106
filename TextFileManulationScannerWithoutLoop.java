import java.io.File;
import java.io.FileNotFoundExcerption;
import java.util.Scanner;
public class TextFileManipulationScannerWithLoop
{
	public Static viod main(String[]args) throws FileNotFoundExcerption
	{
		File file = new File("LemuilParale.txt");
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\Z");
			System.out.print(sc.next());
	}
}