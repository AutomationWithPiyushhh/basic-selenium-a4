package learning_ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FB_element {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("email"));
		
		File source = username.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./errorshots/fb.png");
		
		FileHandler.copy(source, destination);
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
