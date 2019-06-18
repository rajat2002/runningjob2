package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon {

	public WebDriver driver;
	 By sign = By.xpath("//a[@id='nav-link-yourAccount']");
	 By AmazonText = By.xpath("//input[@id='twotabsearchtextbox']");
	 
	 public Amazon(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 this.driver = driver2;
	}


	public WebElement signAmazon()
	 {
		 return driver.findElement(sign);
	 }
	

	public WebElement TextAmazon() {
		// TODO Auto-generated method stub
		return driver.findElement(AmazonText);	
		}
}
