package org.testingWorld.automation.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CreateDriverInstance {
	WebDriver driver;
	public WebDriver generateDriverInstance()
	{
		
		ResourceBundle res=ResourceBundle.getBundle("config");
		if (res.getString("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(res.getString("browser").equalsIgnoreCase("firefox"))
		{
			System.getProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (res.getString("browser").equalsIgnoreCase("ie"))
		{
			System.getProperty("webdriver.InternetExplorer.driver","./Driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.getProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver=new ChromeDriver();	
		}
		driver.get(res.getString("applicationURL"));
		return driver;
			
	}
	public void closeDriver()
	{
		driver.quit();
	}

}
