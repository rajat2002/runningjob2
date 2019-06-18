package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class scrollElement {
	
	public WebDriver driver;

	By link = By.linkText("Manual Testing");
	
	
	public scrollElement(WebDriver driver2) {
		this.driver = driver2;
		// TODO Auto-generated constructor stub
	}


	public WebElement element()
	{
		return driver.findElement(link);
	}
	
}
