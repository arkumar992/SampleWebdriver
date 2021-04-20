package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Class\\drivers\\chromedriver.exe");
		WebDriver driver   = new ChromeDriver();
		System.out.println("I am on test ");
		driver.get("file:///C:/Users/Acer/Desktop/aa/login.html");		
		System.out.println("I am on the login page");
		
		String title = driver.getTitle();
		if ("Hotel Booking".equals(title));
		
		{
			System.out.println("Title verified");
			
		}
		
		driver.findElement(By.xpath("//input[@value ='Login']")).click();
		 driver.findElement(By.name("userName")).sendKeys("admin");
		 
		 driver.findElement(By.xpath("//input[@value ='Login']")).click();
		 
		 driver.findElement(By.id("pwdErrMsg")).getText();
		 
		 driver.findElement(By.name("userPwd")).sendKeys("123");
		 
		 driver.findElement(By.xpath("//input[@value ='Login']")).click();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Alert alert = driver.switchTo().alert();
			String pass = alert.getText();
			System.out.println("Password alert message" + pass);
			alert.accept();
			
			driver.findElement(By.name("userPwd")).clear();
			 driver.findElement(By.name("userPwd")).sendKeys("admin");
			 
			 driver.findElement(By.xpath("//input[@value ='Login']")).click();
			 
			 System.out.println("Next URL IS" + driver.getCurrentUrl() );

	}

}
