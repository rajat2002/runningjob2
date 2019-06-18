package Academy;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Amazon;
import pageObjects.landingPage;

public class verifyAmazonSign extends Base{
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver = initializeDriver();
		 driver.get(pro.getProperty("url1"));
	}
	@Test
	public void verifyAmazon() throws IOException
	{
		
		Amazon am = new Amazon(driver);
		Actions ac = new  Actions(driver);
		ac.moveToElement(am.signAmazon()).contextClick().build().perform();
		ac.moveToElement(((Amazon) am).TextAmazon()).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
				
	
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}
	
	

}
