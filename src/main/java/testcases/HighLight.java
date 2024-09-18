package testcases;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLight {

	/*	public static void main(String[] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("http://google.com/");
		WebElement goobutt = driver.findElementByName("btnK");

		for (int i = 0; i <= 10; i++) {
			driver.executeScript("arguments[0].setAttribute('style', arguments[1]);", goobutt,
					"color: transparent;");
			Thread.sleep(250);
			driver.executeScript("arguments[0].setAttribute('style', arguments[1]);", goobutt,
					"color: Green;");
			Thread.sleep(250);
		}
		//driver.quit();
	}*/

	public static void main(String[] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com/");
		WebElement elem = driver.findElementByXPath("(//input[@name= 'btnI'])[2]");
		System.out.println(elem.getCssValue("color"));
		System.out.println(elem.getCssValue("background-color"));
		//System.out.println(elem.g);
		
		for (int i = 0; i < 10; i++) {
			
			driver.executeScript("arguments[0].setAttribute('style',arguments[1]);", elem,"color: transparent;");
			
			Thread.sleep(300);

			driver.executeScript("arguments[0].setAttribute('style',arguments[1]);", elem,"color: pink;");
		}
		driver.quit();
	}
}