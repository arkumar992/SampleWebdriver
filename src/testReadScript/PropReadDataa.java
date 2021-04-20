package testReadScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PropReadDataa {
	
	public static Properties prop;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		prop = new Properties();
		String path = System.getProperty("user.dir")+"//src//testData//config.properties";
		FileInputStream fin = new FileInputStream(path);
		prop.load(fin);
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Class\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		/*driver.findElement(By.name ( "username")).sendKeys("test123");
		driver.findElement(By.name ( "username")).clear();
		
		driver.findElement(By.id("pwd")).sendKeys("test123");*/
		
		
		
		

	}

}
