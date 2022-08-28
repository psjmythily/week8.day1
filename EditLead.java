package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setup()
	{
		excelFileName = "EditLead";
	}
	
	@Test(dataProvider = "fetch")
	
	public void verifyCreateLead(String username, String password, String FirstName, String LastName) throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.typeUserName(username).typePassword(password).login().clickCrmsfaLink().clickLeadsTab().findLeadsTab().typeFirstNameInFindLeadsPage(FirstName)
          .clickFindLeadsButton().clickFirstLeadID().clickEditLeadButton().typeLastNameinEditLeadPage(LastName).clickUpdateButton().verifyLastName(LastName);
}
	

}
