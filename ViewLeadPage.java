package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage verifyFirstName(String expName)
	{
		String actualName = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(actualName, expName);
		System.out.println("First Name in View Lead Page is verified");
		return this;
	}
	
	public EditLeadPage clickEditLeadButton()
	{
		getDriver().findElement(By.xpath("//a[text()='Edit']")).click();
		return new EditLeadPage();
	}
	
	public ViewLeadPage verifyLastName(String expName)
	{
		String actualName = getDriver().findElement(By.id("viewLead_lastName_sp")).getText();
		Assert.assertEquals(actualName, expName);
		System.out.println("Last Name in View Lead Page is verified");
		return this;
	} 
	
	public DuplicateLeadPage clickDuplicateLeadButton()
	{
		getDriver().findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage();
	}
	
	public MyLeadsPage clickDeleteLeadButton() throws InterruptedException
	{
		getDriver().findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(6000);
		return new MyLeadsPage();
		
	}

}
