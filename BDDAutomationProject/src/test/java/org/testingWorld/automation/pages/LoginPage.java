package org.testingWorld.automation.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	ResourceBundle res;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		res=ResourceBundle.getBundle("Element");
	}
	public void enterUserName(String uname)
	{
		driver.findElement(By.id(res.getString("Login_User_ID"))).sendKeys(uname);
	}
	public void enterPassword(String pass)
	{
		driver.findElement(By.id(res.getString("Login_Password"))).sendKeys(pass);
	}
	public void clickSignInButton()
	{
	 driver.findElement(By.xpath(res.getString("Login_SignIn_xPath"))).click();

}
}