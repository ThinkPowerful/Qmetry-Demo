package qmetry;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTitleTest {
WebDriver driver =null;
	
	@Test
	public void validateTitle()
	{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\ExeFiles\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		boolean title = driver.getTitle().contains("PHPTRAVELS");
		Assert.assertTrue(title);
		
		 try {
			 Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
	}
	
}
