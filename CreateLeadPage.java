package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage typeCompanyName(String company)
	{
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String firstname)
	{
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
	}
	
	public CreateLeadPage typeLastName(String lastName)
	{
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadsButton()
	{
		getDriver().findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage();
	}

}
