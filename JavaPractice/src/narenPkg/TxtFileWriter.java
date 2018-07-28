package narenPkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class TxtFileWriter {
	public static void main(String[] args) {
		try {
 
			String content = "I am writing some text in txt file using java prg";
 
			File file = new File("src/NewFile.txt");
 
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("New File is created.");
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			System.out.println(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			
			System.out.println("File writer is still open and I can writer one more line.");
			bw.newLine();
			bw.write("Second Line I am writing using the java.");
			bw.close();
 
			System.out.println("Text is written successfully to the file.");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}