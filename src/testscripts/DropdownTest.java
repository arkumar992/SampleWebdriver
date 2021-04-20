package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Class\\drivers\\chromedriver.exe");

		System.out.println("Testtttt");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select singleSel = new Select(driver.findElement(By.id("select-demo")));
		singleSel.selectByVisibleText("Tuesday");
		singleSel.selectByValue("Saturday");

		
		
		Select mulSelect = new Select(driver.findElement(By.id("multi-select")));
		if(mulSelect.isMultiple())
		{
			mulSelect.selectByValue("New York");
			mulSelect.selectByIndex(2);
			mulSelect.selectByVisibleText("Texas");
			
			List<WebElement> cities = mulSelect.getAllSelectedOptions();
			System.out.println("Number of items selected: "+cities.size());
			Thread.sleep(3000);
			mulSelect.deselectAll();
 		}
		
		
		
		
	}

}
