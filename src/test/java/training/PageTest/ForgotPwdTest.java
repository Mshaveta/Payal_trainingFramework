package training.PageTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ForgotPwdTest extends BaseTest {
	@Test
	public void verifyForgotPwdLink() {
		lp.forgotPwd();
	}
	 
	

}
