package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSignUp {
	
	public WebDriver driver;
	
	By link = By.xpath("//a[contains(text(),'Terms')]");
	
	
	public GoogleSignUp(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver2;
	}


	public WebElement TermsOfGoogle()
	{
		return driver.findElement(link);
	}
	public String Title()
	{
		return driver.getTitle();
	}

}
