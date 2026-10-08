package learning_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		downcasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;

//		navigate to url using js
		jse.executeScript("window.location='https://www.automationwithpiyush.com/locatorsSignin.html'");

//		jse.executeScript("document.getElementById('email').value='admin';");
		String username = "admin";
		WebElement usernameField = driver.findElement(By.id("email"));
		jse.executeScript("arguments[0].value=arguments[1]", usernameField, username);

		String password = "1234567";
		WebElement passwordField = driver.findElement(By.name("pass"));
		jse.executeScript("arguments[1].value=arguments[0]", password, passwordField);

		Thread.sleep(3000);
		driver.quit();
	}
}
