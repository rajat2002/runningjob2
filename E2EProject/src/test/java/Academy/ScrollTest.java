package Academy;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollTest extends Base{
	
	
	@BeforeTest
	public void initial() throws IOException
	{
		driver = initializeDriver();
		driver.get(pro.getProperty("url3"));		
		
	}
	
	@Test
	public void checkScroll()
	{
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}

	
}
