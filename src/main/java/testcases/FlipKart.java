package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipKart {
	@Test
	public void mouseOver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text() = '✕']").click();
		//driver.findElementByXPath("//input[@class = 'LM6RPg']").sendKeys("iphone",Keys.ENTER);
		
		
		try {
			Actions builder = new Actions(driver);
			WebElement target = driver.findElementByXPath("//Span[text() = 'Men']");
			WebElement target2 = driver.findElementByXPath("//span[text() = 'Casual Shoes']");
			builder.moveToElement(target).perform();
			Thread.sleep(2000);
			builder.click(target2).perform();
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
		}
	}
}