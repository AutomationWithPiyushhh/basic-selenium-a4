package learning_shadow_dom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppQsp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");

//		step 1> get the shadow root
		SearchContext shadowHost = driver.findElement(By.xpath("//div[@class='my-3']/preceding-sibling::div")).getShadowRoot();
		
//		Step 2> access the element inside shadow dow using shadowHost
		shadowHost.findElement(By.cssSelector("[placeholder='Enter your username']")).sendKeys("admin");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
