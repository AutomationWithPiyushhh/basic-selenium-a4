package learning_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectAWP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationwithpiyush.com/locators.html");
		
		WebElement username = driver.findElement(By.id("user_login_field"));
		username.sendKeys("admin"); 
		
		WebElement password = driver.findElement(By.name("security_passphrase"));
		password.sendKeys("admin@123");
		
//		class => collection of features,
//		className() => least recommended but if unique class is there, then go for it
//		submit_btn
		WebElement submit = driver.findElement(By.className("submit_btn"));
		submit.click();
		
		driver.findElement(By.linkText("Reset Password")).click();
		driver.findElement(By.partialLinkText("Logout User")).click();
		driver.findElement(By.linkText("Help Center")).click();
		
//		id="employee-id-input"
		driver.findElement(By.cssSelector("#employee-id-input")).sendKeys("123456");
		
		driver.findElement(By.cssSelector(".verify-status-btn")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
