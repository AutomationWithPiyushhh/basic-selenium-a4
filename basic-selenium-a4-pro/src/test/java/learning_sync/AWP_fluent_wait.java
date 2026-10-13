package learning_sync;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AWP_fluent_wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/synchronization.html");

		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotInteractableException.class);
		
////		task 2
//		driver.findElement(By.id("trigger-input")).click();
//
////		define exp wait
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("target-input")));
//
//		driver.findElement(By.id("target-input")).sendKeys("admin"); // ElementNotInteractableException

//		task 6
		driver.findElement(By.id("btn-selection")).click();
		WebElement checkBox = driver.findElement(By.id("auto-checkbox"));

//		wait for checkbox to be selected
		wait.until(ExpectedConditions.elementToBeSelected(checkBox));

		if (checkBox.isSelected()) {
			System.out.println("selected");
		} else {
			System.out.println("not selected !!!");
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
