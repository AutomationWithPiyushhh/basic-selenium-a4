package learning_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");

//		downcasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String url1 = "https://www.facebook.com/";
		String url2 = "https://www.instagram.com/";
		String url3 = "https://www.zomato.com/";

//		navigate to url using js
		jse.executeScript("window.location=arguments[0]", url2, url3, url1);
		Thread.sleep(1000);
		jse.executeScript("window.location=arguments[1]", url3, url2, url1);
		Thread.sleep(1000);
		jse.executeScript("window.location=arguments[2]", url2, url1, url3);

//		scroll down 
//		jse.executeScript("window.scrollTo(0, 500)");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollTo(0, 700)");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollBy(0, -100)");

		WebElement checkItout = driver.findElement(By.xpath("//div[text()='blinkit']/following-sibling::div"));
//		act.scrollToElement(element).build().perform();
		jse.executeScript("arguments[0].scrollIntoView(true)", checkItout);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
