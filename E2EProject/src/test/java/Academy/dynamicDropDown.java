package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamicDropDown extends Base{
	
	@BeforeTest
	public void initial() throws IOException
	{
		driver = initializeDriver();
		driver.get(pro.getProperty("utl4"));
	
	}
	@Test
	public void checkDynamic()
	{
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXB']")).click();
		driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
		driver.findElement(By.className("ui-datepicker-trigger")).click();
	}


}
