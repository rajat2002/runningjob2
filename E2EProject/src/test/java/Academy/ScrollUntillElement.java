package Academy;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.scrollElement;

public class ScrollUntillElement extends Base{
	
	@BeforeTest
	public void initial() throws IOException
	{
		driver = initializeDriver();
		driver.get(pro.getProperty("url3"));		
		
	}
	
	@Test
	public void intializer()
	{
		scrollElement scr = new scrollElement(driver);
		scr.element();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", scr.element());
		
	}

	
	
}
