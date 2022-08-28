package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class Login extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setup()
	{
		excelFileName = "Login";
	}
	
	@Test(dataProvider = "fetch")
	public void runLogin(String username,String password)
	{
	LoginPage lp = new LoginPage();
	lp.typeUserName(username).typePassword(password).login();
	}

}
