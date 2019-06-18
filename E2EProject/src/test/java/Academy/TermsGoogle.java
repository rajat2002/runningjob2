package Academy;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.GoogleSignUp;

public class TermsGoogle  extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(pro.getProperty("url2"));
		
	}
	@Test
	public void terms()
	{
		GoogleSignUp gs = new GoogleSignUp(driver);
		
		gs.TermsOfGoogle().click();
		System.out.println(gs.Title());
		Set<String> ids =  driver.getWindowHandles();
		Iterator<String> its = ids.iterator();
		String Parent = its.next();
		String child = its.next();
		driver.switchTo().window(child);
		System.out.println(gs.Title());
		driver.switchTo().window(Parent);
		System.out.println(gs.Title());
		
		
		

		
	}
	

}
