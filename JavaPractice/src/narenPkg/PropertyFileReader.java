package narenPkg;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) {

		Properties prop = new Properties();
		FileReader input = null;
		//FileInputStream input = null;
		
		try
		{
			input = new FileReader("EnvDetails.properties");
			//input = new FileInputStream("src\\EnvDetails.properties");
			prop.load(input);
			
			System.out.println(prop.getProperty("URL"));
			System.out.println(prop.getProperty("UserName"));
			System.out.println(prop.getProperty("DbUserName"));
			
			
		/*	Enumeration keys;
			keys = prop.propertyNames();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = prop.getProperty(key);
				System.out.println("Key : " + key + ", Value : " + value);
			}*/

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}