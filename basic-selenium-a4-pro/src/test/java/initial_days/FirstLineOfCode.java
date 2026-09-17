package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstLineOfCode {
	public static void main(String[] args) {
//		format => ctrl + shift + f
//		import => ctrl + space
//		auto import => ctrl + shift + o
		
//		ChromeDriver driver1 = new ChromeDriver();
//		FirefoxDriver driver2 = new FirefoxDriver();
//		EdgeDriver driver3 = new EdgeDriver();
		
//		RemoteWebDriver driver1 = new EdgeDriver();
//		RemoteWebDriver driver2 = new FirefoxDriver();
//		RemoteWebDriver driver3 = new EdgeDriver();

//		WebDriver driver1 = new EdgeDriver();
//		WebDriver driver2 = new FirefoxDriver();
//		WebDriver driver3 = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		/* webdriver is a type 
		 * driver is a ref var
		 * new is a keyword, it will create random memory space in heap area
		 * ChromeDriver() call will do 3 jobs
		 * 1> It will launch the empty chrome browser
		 * 2> It will start the server
		 * 3> load, register and re-initialize the non static members
		*/		
				  driver = new FirefoxDriver();
				  driver = new EdgeDriver();
				  
				  
		
	}
}
