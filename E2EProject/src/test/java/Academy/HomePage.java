package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.loginPage;

public class HomePage extends Base {
	

	@BeforeTest
	public void initialize() throws IOException
	{
		 driver = initializeDriver();
		 driver.get(pro.getProperty("url"));
	}
	
	
	
	@Test(dataProvider = "getData")
	
	public void basePageNavigation(String Username,String password) throws IOException 
	{
		
		driver.get(pro.getProperty("url"));
		landingPage pg = new landingPage(driver);
		pg.getLogin().click();
		loginPage lpg = new loginPage(driver);
		lpg.loginEmail().sendKeys(Username);
		lpg.loginPassword().sendKeys(password);
		lpg.ClickLogin().click();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "nonrestricted@gmail.com";
		data[0][1] = "12345";
		
		data[1][0] = "restricted@gmail.com";
		data[1][1] = "2345";
		
		return data;
	}

}
