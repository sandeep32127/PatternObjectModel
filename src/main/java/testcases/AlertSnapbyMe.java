package testcases;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

//import com.mongodb.MapReduceCommand.OutputType;


public class AlertSnapbyMe {
	static RemoteWebDriver driver;
	 int i =1;
	 @Test
	public void alertSnap() throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("loginbutton").click();
		takesnap();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	
	public  void takesnap() throws AWTException, IOException {
		Robot rbt = new Robot();
		/*File desc = driver.getScreenshotAs(OutputType.FILE);
		File fsc = new File("./snap/image" +i+".jpg");
		FileUtils.copyFile(desc, fsc);*/
		BufferedImage img = rbt.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(img, "jpg", new File("./snap/image" +i+".jpg"));
		i++;
	}

}
