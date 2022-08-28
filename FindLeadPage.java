package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{
	

	public FindLeadPage typeFirstNameInFindLeadsPage(String firstName)
	{
		getDriver().findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
		return this;
	}
	
	public FindLeadPage clickFindLeadsButton()
	{
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public ViewLeadPage clickFirstLeadID() throws InterruptedException
	{
    WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
		
		Thread.sleep(5000);
		
		WebElement ele = getDriver().findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
	    LeadID = ele.getText();
		System.out.println(LeadID);
		
		try {
			
			ele.click();
		} catch (StaleElementReferenceException e) {
	
			System.out.println("Failed due to staleness");
			
			wait.until(ExpectedConditions.stalenessOf(ele));
			ele.click();
			
		}
		catch(NoSuchElementException e1)
		{
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
		}
		return new ViewLeadPage();
		
	}
	
	public FindLeadPage typeLeadIDInFindLeadsPage()
	{
		getDriver().findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
		return this;
	}
	
	public FindLeadPage verifyDeletedID(String expected)
	{
		String actualText = getDriver().findElement(By.xpath("//div[text()='No records to display']")).getText();
		Assert.assertEquals(expected, actualText);
		System.out.println("Delete Lead is done successfully");
		return this;
	}

}
