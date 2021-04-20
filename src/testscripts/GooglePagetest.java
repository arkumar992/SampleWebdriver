package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GooglePagetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Class\\drivers\\chromedriver.exe");

		System.out.println("Testtttt");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		/*driver.get("https://www.testandquiz.com/selenium/testing.html");
		List<WebElement> items = driver.findElements(By.tagName("input"));
		for(WebElement e:items) {
			System.out.println(e.getAttribute("name"));
		}
		//sample 2
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Java");
		List<WebElement> searchResult = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbtc']"));
		System.out.println("Item size are"+ searchResult.size());
		for(WebElement e:searchResult) {
			System.out.println("inside for loop");
			if(e.getText().equalsIgnoreCase("Java tutorial")) {
				System.out.println("Element found");
				break;
			}
		}*/
		//Sample 3- action
	driver.get("file:///C:/Users/Acer/Downloads/Web Table.html");
		WebElement check=driver.findElement(By.xpath("//input[@name='select1']"));
		Actions action=new Actions(driver);
		action.click(check).perform();
		check.click();

	}

}
