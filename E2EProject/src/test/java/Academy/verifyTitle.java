package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;

public class verifyTitle extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver = initializeDriver();
		 driver.get(pro.getProperty("url"));
	}
	
	@Test
	public void validateTitle() throws IOException
	{
		
		 landingPage pg = new landingPage(driver);
		 pg.verifyTitle().getText();
		 Assert.assertEquals(pg.verifyTitle().getText(), "FEATURED COURSES123");
				 
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}
}
