package testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginTestSeleniGridRemote {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium Class\\drivers\\chromedriver.exe");

		String strHub = "http://192.168.1.196:4444/wd/hub";
		System.out.println("Testtttt");
		
		WebDriver driver = new RemoteWebDriver(new URL(strHub), options);
		
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Acer/Downloads/DemoPage.html");
		driver.findElement(By.name ( "username")).sendKeys("test123");
		driver.findElement(By.name ( "username")).clear();
		
		driver.findElement(By.id("pwd")).sendKeys("test123");
		
		
		

	}

}
