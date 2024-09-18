package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://www.naukri.com/");

		int y = driver.findElementByLinkText("Browse All Jobs").getLocation().getY();

		((JavascriptExecutor) driver).executeScript("scroll(0,"+y+");");


	}
}

