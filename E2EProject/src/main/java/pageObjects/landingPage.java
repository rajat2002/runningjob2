package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	By signin = By.xpath("//a[contains(@href,'sign_in')]");
	By title = By.cssSelector(".text-center>h2");
	By navbar = By.cssSelector(".nav navbar-nav navbar-right>li>a");
	
	
	public landingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}

	public WebElement getLogin()
	{
	   return driver.findElement(signin);
	}
	
	public WebElement verifyTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement navBarVerify()
	{
		return driver.findElement(navbar);
	}

}
