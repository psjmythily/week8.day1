package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setup()
	{
		excelFileName = "DuplicateLead";
	}
	
	@Test(dataProvider = "fetch")
	
	public void verifyCreateLead(String username, String password, String FirstName, String LastName, String Company, String DuplicateFirstName)
	{
		LoginPage lp = new LoginPage();
		lp.typeUserName(username).typePassword(password).login().clickCrmsfaLink().clickLeadsTab().clickCreateLeadsLink()
		.typeCompanyName(Company).typeFirstName(FirstName).typeLastName(LastName).clickCreateLeadsButton().clickDuplicateLeadButton().typeDuplicateFirstName(DuplicateFirstName)
		.clickCreateLeadsButton().verifyFirstName(DuplicateFirstName);
	}

}
