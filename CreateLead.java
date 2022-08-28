package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setup()
	{
		excelFileName = "CreateLeadData";
	}
	
	@Test(dataProvider = "fetch")
	
	public void verifyCreateLead(String username, String password, String FirstName, String LastName, String Company)
	{
		LoginPage lp = new LoginPage();
		lp.typeUserName(username).typePassword(password).login().clickCrmsfaLink().clickLeadsTab().clickCreateLeadsLink()
		.typeCompanyName(Company).typeFirstName(FirstName).typeLastName(LastName).clickCreateLeadsButton().verifyFirstName(FirstName);
		
	}
	
}
