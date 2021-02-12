package training.PageTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import training.PageObject.LoginPage;
import utility.PropertiesFileReader;

public class BaseTest {
	public static WebDriver driver;
	LoginPage lp;

	/**
	 * Launch the Browser
	 */

	@BeforeClass
	public void browserLaunch() throws IOException {
		String browser = PropertiesFileReader.getConfigProp("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/");
		lp = new LoginPage(driver);

	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
