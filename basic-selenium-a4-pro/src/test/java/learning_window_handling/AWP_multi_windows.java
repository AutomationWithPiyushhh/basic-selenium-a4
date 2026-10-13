package learning_window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_multi_windows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/");

//		1> get the home address or session id
		String PID = driver.getWindowHandle();

//		2> perform the task which will open new window/s or tab/s
		driver.findElement(By.cssSelector("[onclick='openSocialChannels()']")).click();

//		3> get all the window addresses or session ids
		Set<String> CIDs = driver.getWindowHandles();

//		4> switch to each and every window 
		for (String i : CIDs) {
			driver.switchTo().window(i);
			System.out.println(driver.getTitle());
//			5> break the loop wherever condition meets
			if (driver.getTitle().contains("In")) {
				break;
			}
		}

//		6> perform the task
		Thread.sleep(2000);
		driver.close();

//		7> come back home
		driver.switchTo().window(PID);

		
		Thread.sleep(3000);
		driver.quit();
	}
}