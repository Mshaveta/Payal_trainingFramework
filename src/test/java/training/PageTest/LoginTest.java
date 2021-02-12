package training.PageTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import training.PageObject.HomePage;
import utility.PropertiesFileReader;

public class LoginTest extends BaseTest {
	HomePage hp;
	
	/**
	 * Verify that user is able to Login*/
	
	    @Test(priority=1)
		public void verifyValidLogin() throws IOException {
		String username=PropertiesFileReader.getConfigProp("username");
		String password=PropertiesFileReader.getConfigProp("password");
		hp=lp.doValidLogin(username, password);
		Assert.assertEquals(hp.getDashboardHeading().getText(),"Dashboard1");
		
	}
	    
	   

}
