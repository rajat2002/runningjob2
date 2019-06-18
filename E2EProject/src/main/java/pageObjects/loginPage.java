package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	public WebDriver driver;
     By email =By.id("user_email");
	 By password = By.id("user_password");
	 By clicklogin = By.xpath("//input[@value='Log In']");
	 
	 public loginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 
		 this.driver = driver2;
	}

	public WebElement loginEmail()
	 {
		 return driver.findElement(email);
	 }
	 
	 public WebElement loginPassword()
	 {
		 return driver.findElement(password);
		 
	 }
	 public WebElement ClickLogin()
	 {
		 return driver.findElement(clicklogin);
	 }
	 
}
