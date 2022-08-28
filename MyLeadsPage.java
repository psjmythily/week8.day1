package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLeadsLink()
	{
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	public FindLeadPage findLeadsTab()
	{
		getDriver().findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage();
	}
	
	public void mergeLeadsTab()
	{
		getDriver().findElement(By.linkText("Merge Leads")).click();
	}

}
