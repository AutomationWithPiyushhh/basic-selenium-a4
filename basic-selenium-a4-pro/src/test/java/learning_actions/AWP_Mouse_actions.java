package learning_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AWP_Mouse_actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/actions.html");

		Thread.sleep(1000);

		WebElement rc = driver.findElement(By.id("right-click-area"));

		Actions act = new Actions(driver);
//		act.moveToElement(rc).contextClick().build().perform();
//		act.contextClick(rc).build().perform();

		WebElement hold = driver.findElement(By.id("click-hold"));
//		click&hold and release
//		act.clickAndHold(hold).build().perform();
//		Thread.sleep(6000);
//		act.release().build().perform();

		WebElement src = driver.findElement(By.id("prod-phone"));
		WebElement dest = driver.findElement(By.id("cart-zone"));
		
		act.scrollToElement(dest).build().perform();
		act.scrollByAmount(0, 300).build().perform();
		
		act.dragAndDrop(src, dest).build().perform();
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}
}
