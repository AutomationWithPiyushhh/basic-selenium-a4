package learning_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		Thread.sleep(1000);

		Window win = driver.manage().window();
		
//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
		
//		win.maximize();
//		Thread.sleep(1000);
//		win.minimize();
//		Thread.sleep(1000);
//		win.fullscreen();
		
//		Dimension dim1 = win.getSize();
//		System.out.println(dim1);
//		System.out.println(dim1.getWidth());
//		System.out.println(dim1.getHeight());
		
//		win.setSize(new Dimension(450, 450));
		
//		Point pt1 = win.getPosition();
//		System.out.println(pt1);
//		System.out.println(pt1.getX());
//		System.out.println(pt1.getY());

//		win.setPosition(new Point(10, 100));
		
//		Navigation
		Navigation nav = driver.navigate();
		
		nav.to("https://www.instagram.com/");
		Thread.sleep(1000);
		nav.back();
		Thread.sleep(1000);
		nav.forward();
		Thread.sleep(1000);
		nav.refresh();
		
		
		Thread.sleep(3000);
		driver.quit();	
	}
}
