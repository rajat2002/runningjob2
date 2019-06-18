package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;

public class verifyNavbarDisplayed  extends Base {
	

	@BeforeTest
	public void initialize() throws IOException
	{
		 driver = initializeDriver();
		 driver.get(pro.getProperty("url"));
	}
	
	
	@Test
	public void verifyNav() throws IOException
	{
		driver = initializeDriver();
		driver.get(pro.getProperty("url"));
		landingPage pg = new landingPage(driver);
		Assert.assertTrue(pg.navBarVerify().isDisplayed());
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}

}
