package Yahoo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YahooLogin 
{	
	Properties p=new Properties();	
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser) throws FileNotFoundException, IOException
	{
		p.load(new FileInputStream("F://SeleniumRevisit/ParametersFromJenkins/config.properties"));
		if(browser.equalsIgnoreCase("Firefox"))
		{			
			System.setProperty(p.getProperty("firefoxKey"),p.getProperty("firefoxValue"));
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println(browser+" Launched");
		}
		else if(browser.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty(p.getProperty("chromeKey"),p.getProperty("chromeValue"));
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println(browser+" Launched");
		}		
	}
	
	@Parameters("url")
	@Test
	public void loginApp(String url) throws InterruptedException
	{		
		driver.get(url);
		driver.findElement(By.xpath("//input[@class='phone-no ']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-passwd")).sendKeys(p.getProperty("password"));
		driver.findElement(By.id("login-signin")).click();
	}
	
	@Parameters("browser")
	@AfterMethod
	public void closeBrowser(String browser) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		System.out.println(browser+" Closed");
	}
}
