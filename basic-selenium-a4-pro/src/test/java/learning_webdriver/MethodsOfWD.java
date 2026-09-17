package learning_webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWD {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();

//		get is used to navigate to the given URL => Fully Qualified Path
		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);

//		Get the title of the current page.
		String title = driver.getTitle();
		System.out.println(title);

//		Get the url of the current page
		String url = driver.getCurrentUrl();
		System.out.println(url);

//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);

//		driver.manage();

		Navigation nav = driver.navigate();
		nav.to("https://www.instagram.com/");

		Thread.sleep(1000);

		URL url1 = new URL("https://www.facebook.com/");
		nav.to(url1);

		Thread.sleep(1000);

		nav.back();

		Thread.sleep(1000);

		nav.forward();

		Thread.sleep(1000);

		nav.refresh();

//		driver.getWindowHandle();
//		driver.getWindowHandles();
//		driver.switchTo();

//		close will close current window, it will not stop the server
//		driver.close();
//		quit will close all the windows, it will stop the server
		driver.quit();
	}
}
