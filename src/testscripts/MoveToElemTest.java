package testscripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElemTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Class\\drivers\\chromedriver.exe");

		System.out.println("Testtttt");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		// screen shot
		TakesScreenshot screen = (TakesScreenshot)driver;
		File srcFile = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\TestMaven\\webdrivedrproject\\screenshot\\test.jpg"));
		
		
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Components')]"));
		Actions action = new Actions(driver);
		 
		action.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]")).click();
		
		
	}

}
