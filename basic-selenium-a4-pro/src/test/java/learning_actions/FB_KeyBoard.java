package learning_actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_KeyBoard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		Actions act = new Actions(driver);

		Thread.sleep(2000);

////		write something wherever the keyboard control is present
//		act.sendKeys("admin").perform();

////		click on TAB
//		act.sendKeys(Keys.TAB).perform();

////		write something wherever the keyboard control is present
//		act.sendKeys("password").perform();
//
////		click on ENTER
//		act.sendKeys(Keys.ENTER).perform();

////		COPY PASTE
////		write something wherever the keyboard control is present
//		act.sendKeys("admin").perform();
//		
////		CTRL + A
//		act.keyDown(Keys.CONTROL).perform();
//		act.sendKeys("a").perform();
//		act.keyUp(Keys.CONTROL).perform();
//
////		ctrl + c
//		act.keyDown(Keys.CONTROL).perform();
//		act.sendKeys("c").perform();
//		act.keyUp(Keys.CONTROL).perform();
//		
////		click tab
//		act.sendKeys(Keys.TAB).perform();
//		
////		ctrl + v
//		act.keyDown(Keys.CONTROL).perform();
//		act.sendKeys("v").perform();
//		act.keyUp(Keys.CONTROL).perform();

		
////		COPY PASTE
////		write something wherever the keyboard control is present
//		act.sendKeys("admin").perform();
//		
////		CTRL + A
//		act.keyDown(Keys.CONTROL)
//				.sendKeys("a")
//				.keyUp(Keys.CONTROL)
//				.perform();
//
////		ctrl + c
//		act.keyDown(Keys.CONTROL)
//				.sendKeys("c")
//				.keyUp(Keys.CONTROL).perform();
//		
////		click tab
//		act.sendKeys(Keys.TAB).perform();
//		
////		ctrl + v
//		act.keyDown(Keys.CONTROL)
//				.sendKeys("v")
//				.keyUp(Keys.CONTROL).perform();

//		COPY PASTE
//		write something wherever the keyboard control is present
		act.sendKeys("admin")
				.keyDown(Keys.CONTROL)
				.sendKeys("ac")
				.keyUp(Keys.CONTROL)
				.sendKeys(Keys.TAB)
				.keyDown(Keys.CONTROL)
				.sendKeys("v")
				.keyUp(Keys.CONTROL)
				.pause(Duration.ofSeconds(1))
				.sendKeys(Keys.ENTER)
				.perform();

		Thread.sleep(9000);
		driver.quit();
	}
}
