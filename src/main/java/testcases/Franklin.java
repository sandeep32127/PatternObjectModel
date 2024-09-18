package testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

//import org.bson.Document;
//import org.apache.poi.xwpf.usermodel.Document;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Franklin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.franklintempleton.com/");
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			
		}
		
		//using link text - wont work - As available in the DOM
		//driver.findElementByLinkText("Equity").click();
		
		// --- Or using the text visible in webPage-->>>	(works)
		//driver.findElementByLinkText("EQUITY").click();
		
		
		// Using Xpath (works)
		driver.findElementByXPath("//a[text()='Equity']").click();
		//driver.quit();
		
	}

	}


