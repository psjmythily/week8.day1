package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelData;

public class ProjectSpecificMethods {
	
	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();
	public static String LeadID;
	
	//setter method for driver
	public void setDriver() {
		remoteWebDriver.set(new ChromeDriver());
	}
	
	//getter method for driver
	public RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}
	
	//public static ChromeDriver driver;
	public String excelFileName="";
	
	@DataProvider(name="fetch")
	public String[][] fetchData() throws IOException 
	{
		String[][] data = ExcelData.readData(excelFileName);
		return data;
	}
	
    @BeforeMethod	
	public void preCondition()
	{
			WebDriverManager.chromedriver().setup();
			setDriver();
			 //driver = new ChromeDriver();	
			getDriver().get("http://leaftaps.com/opentaps/control/main");
			getDriver().manage().window().maximize();	
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	  @AfterMethod 
	  public void tearDown() 
	  { 
		  getDriver().close(); 
	  }

}
