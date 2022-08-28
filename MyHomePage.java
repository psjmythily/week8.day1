package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyLeadsPage clickLeadsTab() 
	{
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}

}
