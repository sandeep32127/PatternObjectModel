package testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertSnap {
	int i=5;
	@Test
	public void alertSnap() throws IOException, AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		System.out.println(driver.findElementById("loginbutton").getSize());
		driver.findElementById("loginbutton").click();		
		takeSnap();
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().;
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)))
		driver.switchTo().alert().accept();
	}
	public void takeSnap() throws IOException, AWTException {
		BufferedImage img = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(img, "jpg", new File("./snap/"+i+".jpg"));
		i++;
	}
}
