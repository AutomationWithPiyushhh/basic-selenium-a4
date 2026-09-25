package learning_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationwithpiyush.com/locators.html");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement i : links) {
			i.click();
			Thread.sleep(2000);
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
