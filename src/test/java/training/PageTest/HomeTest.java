package training.PageTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import training.PageObject.HomePage;

public class HomeTest extends BaseTest {
	HomePage hp;
	/**
	  *Verify user is able to LogOut*/
	@Test(priority=2)
	public void verifyLogOut() {
		//login
		hp=lp.doValidLogin("Admin", "admin12");
		//logout
		lp=hp.doLogOut();
		
	}
	 
	

}
