package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int y = driver.findElementByXPath("//label[text() = 'Please inform me about IRCTC SBI Card through phone*  ']").getLocation().getY();
		driver.executeScript("scroll(0,"+y+");");
		driver.executeScript("scroll(0,"+y+");");
	
}
}

