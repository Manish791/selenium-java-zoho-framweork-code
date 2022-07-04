package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest{
	
	@Test(dataProviderClass  = ReadXLSdata.class,dataProvider="bvtdata")
	public static void LoginTest(String username, String Password) throws InterruptedException
	{
		
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();					//locators in properties file
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username ); //locators in properties file
		driver.findElement(By.id(loc.getProperty("next_button"))).click();							//locators in properties file
		Thread.sleep(4000);
		driver.findElement(By.name(loc.getProperty("pwd_field"))).sendKeys(Password);	//locators in properties file
		Thread.sleep(4000);
		driver.findElement(By.id(loc.getProperty("next_button"))).click();
		Thread.sleep(8000);	
	}

} 
//	@DataProvider(name="testdata")
//	public Object[][] t_Data()
//	{
//		return  new Object[][] {
//			{"t@outlook.com","lallupanju#"},
//			{"ta@outlook.com","lallupanju#"},
//			{"tar@outlook.com","lallupanju#"},
//			{"taru@outlook.com","lallupanju#"},
//			{"tarunk_99@outlook.com","lallupanju#"},
//			
//		};
//	}
//			
//}
 //all the locators must be coming from the properties file 