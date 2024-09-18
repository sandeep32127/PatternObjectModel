package testcases;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test
public class DownloadFiles {

	RemoteWebDriver driver;
	DesiredCapabilities cap;
	//@SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	public void downloadFiles()	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		String downloadFilepath = "E:\\";
		HashMap<String, Object> setPath = new HashMap<String, Object>();	
		setPath.put("download.default_directory", downloadFilepath); //To set path
		setPath.put("safebrowsing.enabled", "false"); // To disable security check

		HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		options.setExperimentalOption("prefs", setPath);
		options.addArguments("--disable-extensions"); //to disable browser extension popup
		
		cap = DesiredCapabilities.chrome(); //Adding capabilities
		cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.win-rar.com/predownload.html");
		driver.findElementByLinkText("Download WinRAR").click();
		//WebElement findElementByLinkText = driver.findElementByLinkText("Download WinRAR");
		//((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('value','"+downloadFilepath+"')", findElementByLinkText);
	}
}

