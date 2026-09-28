package learning_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_imp_wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/synchronization.html");

		WebElement start = driver.findElement(By.xpath("//button[contains(@onclick, 'start')]"));
		start.click();

		WebElement stop = driver.findElement(By.cssSelector("#dynamic-content > button"));
		stop.click();

//		Thread.sleep(3000);
		driver.quit();
	}
}
