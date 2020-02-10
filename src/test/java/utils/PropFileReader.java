package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropFileReader {
	
	static FileInputStream fis;
	static Properties prop;
	
	public static String getProp(String path, String property) {
		String finalPath = "src//test//resources//PropertyFiles//"+path+".properties";
		try {
			fis = new FileInputStream(finalPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(property);
		
	}

}
