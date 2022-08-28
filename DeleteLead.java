package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setup()
	{
		excelFileName = "DeleteLead";
	}
	
	@Test(dataProvider = "fetch")
	
	public void verifyCreateLead(String username, String password, String FirstName, String Message) throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.typeUserName(username).typePassword(password).login().clickCrmsfaLink().clickLeadsTab().findLeadsTab().typeFirstNameInFindLeadsPage(FirstName)
          .clickFindLeadsButton().clickFirstLeadID().clickDeleteLeadButton().findLeadsTab().typeLeadIDInFindLeadsPage().clickFindLeadsButton().verifyDeletedID(Message);
}

}
