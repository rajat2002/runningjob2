package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class verifyKrctc extends Base{

	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
	
	}
	@Test
	public void veriifykrctc()
	{
		
	  driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
	  driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
	   
	   JavascriptExecutor js  = (JavascriptExecutor)driver;
	   String text =  (String) js.executeScript("return document.getElementById(\"fromPlaceName\").value;");
	   System.out.print(text);
	   int i=0;
	   while(!text.equalsIgnoreCase("BENGALURU INTRNATION AIRPORT"))
	   {
		   i++;
		   driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		   text =  (String) js.executeScript("return document.getElementById(\"fromPlaceName\").value;");
		   System.out.print(text);
		   if(i>10)
		   {
			   break;
		   }
	   }
	   if(i>10)
	   {
		   System.out.print("element not found");
	   }
	   else
	   {
		   System.out.print("element  found");
   
	   }
	  
	
	}
	
	
}
