package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{
	
	public DuplicateLeadPage typeDuplicateFirstName(String DuplicateFirstName)
	{
		WebElement firstName = getDriver().findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys(DuplicateFirstName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadsButton()
	{
		getDriver().findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage();
	}

}
