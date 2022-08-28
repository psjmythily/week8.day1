package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	
	public EditLeadPage typeLastNameinEditLeadPage(String lastName)
	{
	WebElement last = getDriver().findElement(By.id("updateLeadForm_lastName"));
	last.clear();
	last.sendKeys(lastName);
	return this;
	}
	
	public ViewLeadPage clickUpdateButton()
	{
		getDriver().findElement(By.xpath("//input[@value='Update']")).click();
		return new ViewLeadPage();
	}

}
