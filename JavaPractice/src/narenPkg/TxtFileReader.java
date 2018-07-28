package narenPkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileReader {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		try
		{
			File file = new File("C:\\selenium.txt");
			String sCurrentLine;
			//fr = new FileReader("C:\\selenium.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			/*file.isFile();
			file.isDirectory();*/
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			/*br.close();
			fr.close();*/
			try {
				if (br != null) {
					fr.close();
					br.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}