package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Jquery1 {
	@Test
	public void dragTest() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable/");
		WebElement drv = driver.findElementByXPath("//iframe[@class = 'demo-frame']");
		driver.switchTo().frame(drv);
		WebElement item1 = driver.findElementByXPath("//li[text() = 'Item 1']");
		WebElement item5 = driver.findElementByXPath("//li[text() = 'Item 5']");
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).release(item5).perform();
		//driver.quit();
	}

}
