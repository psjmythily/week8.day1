package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage typeUserName(String username)
	{
		getDriver().findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	public LoginPage typePassword(String password)
	{
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public HomePage login()
	{
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
	
	}

