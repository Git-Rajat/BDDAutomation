package org.testingWorld.automation.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Compare {
	public static boolean validatePageUrl(WebDriver driver,String expectedURL)
	{
		boolean result=false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
		{
			result=true;
		}
		return result;
		
	}
	public static boolean validateElementByXpath(WebDriver driver,String xpath)
	{
		boolean result=false;
		try
		{
			driver.findElement(By.xpath(xpath));
			result=true;
		}
		catch(Exception e)
		{
			
		}
		return result;
	}

}
