package learning_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions setting1 = new ChromeOptions();
		setting1.addArguments("--disable-notifications");
		setting1.addArguments("--incognito");
		setting1.addArguments("--start-maximized");

		ChromeOptions setting2 = new ChromeOptions();
		setting2.addArguments("--disable-notifications");
		setting2.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(setting1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");

		Thread.sleep(10000);
		driver.quit();
	}

}
