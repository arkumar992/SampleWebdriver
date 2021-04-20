package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExcutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Class\\drivers\\chromedriver.exe");

		System.out.println("Testtttt");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		WebElement searchbox = (WebElement)js.executeScript("return document.getElementsByName('search')[0]");
		searchbox.sendKeys("phone");
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		js.executeScript("document.querySelector('#datepicker1').value ='28/03/2020'");
		

	}

}
