package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileReader fr;
	public static Properties loc=new Properties();
	public static FileReader fr1;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		if (driver==null)
		{
			
			 fr=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			 fr1=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			prop.load(fr);
			loc.load(fr1);
			
			
			
		}
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup(); //base
			 driver=new ChromeDriver();
			 driver.get(prop.getProperty("testurl")); 
			
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup(); //base
			 driver=new FirefoxDriver();
			 driver.get(prop.getProperty("testurl"));
		}
			
		{
			FileReader fr=new FileReader("C:\\Users\\tarun\\eclipse\\jee-2022-03\\eclipse\\SeleniumAutomationFramework\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
			
			
			
		}
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		System.out.println("Teardown successfull");
	}
		
		{
			
			
		}

	}


