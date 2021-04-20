package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Class\\drivers\\chromedriver.exe");

		System.out.println("Testtttt");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		//normal alert
		driver.findElement(By.xpath("//button[contains(text(),'Click me!')][1]")).click();
		Alert alert  = driver.switchTo().alert();
		System.out.println("Alert Message : "+ alert.getText());
		Thread.sleep(1000);
		alert.accept();
		//confirmationalert
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me!') and @class ='btn btn-default btn-lg']")).click();
		Alert confirm  = driver.switchTo().alert();
		System.out.println("Alert Message : "+ confirm.getText());
		Thread.sleep(2000);
		confirm.dismiss();
		
		//prompt alert
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
		Alert prompt  = driver.switchTo().alert();
		System.out.println("Alert Message : "+ prompt.getText());
		prompt.sendKeys("Hellow welocom");
		Thread.sleep(2000);
		
		
	}

}
