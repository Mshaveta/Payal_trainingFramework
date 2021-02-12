package training.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	By unameTextField=By.id("txtUsername");
	By pwdTextField=By.id("txtPassword");
	By loginButton=By.xpath("//input[@id='btnLogin']");
	By forgotLink=By.linkText("Forgot your password?");
	
	/**
	  *Adding Constructor as parent class having one Parameterized constructor and to call the parent constructor we use the super keyword*/
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	  *Send the credentials through getElement method which we created in BasePage class and in getElement method,locator parameter is used which locate the elements according to method we call*/
	public WebElement getUserName() {
		return getElement(unameTextField);
	}
	public WebElement getPassword() {
		return getElement(pwdTextField);
	}
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	public WebElement getForgotLink() {
		return getElement(forgotLink);
	}
	/**
	  *Method for Login and redirect the user to HomePage*/
	public HomePage doValidLogin(String username, String password) {
		System.out.println("Driver-"+driver);
		getUserName().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
		HomePage hp=new HomePage(driver);
		return hp;
	}
	public ForgotPwdPage forgotPwd() {
		getForgotLink().click();
		ForgotPwdPage fp=new ForgotPwdPage(driver);
		return fp;
		
	}

}
