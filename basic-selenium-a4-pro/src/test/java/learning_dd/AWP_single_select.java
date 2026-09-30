package learning_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AWP_single_select {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/dropdown.html");

		WebElement countryDD = driver.findElement(By.id("single-select"));
		WebElement langDD = driver.findElement(By.id("multi-select"));

		Select countrySel = new Select(countryDD);
		Select langSel = new Select(langDD);

		Thread.sleep(500);

		countrySel.selectByIndex(4);

//		List<WebElement> countries = countrySel.getOptions();
//		
//		for(WebElement i : countries) {
//			String text = i.getText();
//			System.out.println(text);
//		}

//		countrySel.deselectAll(); UnsupportedOperationException: You may only deselect option of a multi-select

//		if (countrySel.isMultiple()) {
//			countrySel.deselectAll();
//		}

//		MULTI SELECT DROPDOWN

		langSel.selectByIndex(0);
		langSel.selectByValue("selenium");
		langSel.selectByVisibleText("Maven");

		String firstSelected = langSel.getFirstSelectedOption().getText();
//		System.out.println(firstSelected);

		List<WebElement> allSelected = langSel.getAllSelectedOptions();
		for (WebElement i : allSelected) {
			String text = i.getText();
			System.out.println(text);
		}

		langSel.deselectAll();

		Thread.sleep(3000);
		driver.quit();
	}
}
