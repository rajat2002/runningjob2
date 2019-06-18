package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class staticDropDown extends Base{
	

	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(pro.getProperty("utl4"));
	}
	
	@Test
	public void staticdropdown()
	{
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("INR");
		s.selectByIndex(3);
	
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver = null;
	}

}
