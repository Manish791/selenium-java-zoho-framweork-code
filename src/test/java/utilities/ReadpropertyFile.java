package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\tarun\\eclipse\\jee-2022-03\\eclipse\\SeleniumAutomationFramework\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		Properties prop =new Properties();
		prop.load(fr);          
		System.out.println(prop.getProperty("browser")); //to get the key from the property file should be in ""
		System.out.println(prop.getProperty("testurl"));
		
		
		
		
		
	}

}
