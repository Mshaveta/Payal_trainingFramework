package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
     
public class PropertiesFileReader {
	public static String getConfigProp(String propName) throws IOException {
	FileInputStream fis;
	//get the browser file path/username/password
	String propFilePath=System.getProperty("user.dir")+ "\\config\\browser.properties";
	
	 fis=new FileInputStream(propFilePath);
	
	Properties prop=new Properties();
	
		prop.load(fis);
		String propVal=prop.getProperty(propName);
		return propVal;
	
}
}
