package Academy;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public Properties pro;
	public WebDriver initializeDriver () throws IOException
	{
		
		 pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\E2EProject\\src\\main\\java\\Academy\\data.properties");
		pro.load(fis);
		String BrowserName = pro.getProperty("Browser");
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		return driver;
		
	}
	public void getScreenshot(String name) throws IOException
	{
	    File src =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File ("c:\\Users\\Test\\ "+name+" \\screenShot.png"));
	      
	}

}

