package training.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	By logOutLink=By.linkText("Logout");
	By welcomeLink=By.partialLinkText("Welcome");
	By dashboardText=By.xpath("//h1[text()='Dashboard']");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public WebElement getLogOutLink() {
		return getElement(logOutLink);
	}
	public WebElement getWelcomeLink() {
		return getElement(welcomeLink);
	}
	public WebElement getDashboardHeading() {
		return getElement(dashboardText);
	}
	/**
	  *Method to logOut*/
	public LoginPage doLogOut() {
		getWelcomeLink().click();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		getLogOutLink().click();
		return new LoginPage(driver);
	}

}
