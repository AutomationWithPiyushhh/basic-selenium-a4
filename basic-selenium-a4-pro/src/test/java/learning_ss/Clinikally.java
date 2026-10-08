package learning_ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;



public class Clinikally {
	private static String str;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.clinikally.com/");
		
		
		Thread.sleep(3000);
//		1> downcasting
		HasFullPageScreenshot tks = (HasFullPageScreenshot) driver;
		
//		2> take ss of the webpage
//		Obtain the screenshot into a temporary file that will be deleted once the JVM exits. 
//		It is up to users to make a copy of this file.
		File source =  tks.getFullPageScreenshotAs(OutputType.FILE);
		
//		3> create the Java representation object of the physical file
		File destination = new File("./errorshots/clinikally.png");
		
//		4> copy the content to the dummy file
		FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
