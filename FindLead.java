package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class FindLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setup()
	{
		excelFileName = "FindLead";
	}
	
	@Test(dataProvider = "fetch")
	
	public void verifyCreateLead(String username, String password, String FirstName) throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.typeUserName(username).typePassword(password).login().clickCrmsfaLink().clickLeadsTab().findLeadsTab().typeFirstNameInFindLeadsPage(FirstName)
          .clickFindLeadsButton().clickFirstLeadID().verifyFirstName(FirstName);
}
}
