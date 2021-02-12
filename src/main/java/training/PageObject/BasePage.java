package training.PageObject;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage  {

	public WebDriver driver;
	/**
	  *Constructor to initialize the driver,from BaseTest class get the value for driver,
	  *when we create object in BaseTest and pass the parameter than it will call the constructor and driver is initialized */
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	/**
	  *Method to find the elements*/
	public WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	public static void captureScreenShot(String testCaseName,WebDriver wDriver) throws IOException
	{
	TakesScreenshot ts=(TakesScreenshot) wDriver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	File destFile=new File(destinationFile);
	FileUtils.copyFile(source, destFile);
	}
}