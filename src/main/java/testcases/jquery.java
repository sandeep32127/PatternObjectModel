package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class jquery {
	@Test
	public void JQUERY() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text() = 'Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text() = 'Item 3']");
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, item3.getLocation().getX(), item3.getLocation().getY()).perform();
		//driver.quit();
	}
	

}
