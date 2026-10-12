package learning_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

		driver.findElement(By.xpath("//div[@data-val='exp']//h2")).click();
		
		WebElement resumeUpload = driver.findElement(By.id("resumeUpload"));
		resumeUpload.sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\WindowHandle.pdf");
		
		Thread.sleep(7000);
		driver.quit();
	}
}
