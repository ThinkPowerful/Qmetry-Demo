package qmetry;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateLoginTest {
	WebDriver driver =null;
	
	@Test
	public void validateLogin()
	{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\ExeFiles\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		boolean title = driver.getTitle().contains("Google");
		Assert.assertTrue(title);
		
		 try {
			 Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
		
	}

}
