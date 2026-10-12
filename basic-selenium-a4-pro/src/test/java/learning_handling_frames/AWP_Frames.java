package learning_handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.automationwithpiyush.com/frames.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("name_input")).sendKeys("Abhijeet Dipke");
		
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame("frame_b");
		
		driver.switchTo().defaultContent();
		WebElement frameB = driver.findElement(By.id("frame_b"));
		driver.switchTo().frame(frameB);
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
