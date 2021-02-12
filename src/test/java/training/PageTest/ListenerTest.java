package training.PageTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import training.PageObject.BasePage;

public class ListenerTest extends BaseTest implements ITestListener {

	public void onTestFailure(ITestResult Result) {

		System.out.println("Driver value-" + driver);
		System.out.println("The name of the testcase failed is :" + Result.getName());
		try {
			String testMethodName = Result.getMethod().getMethodName();

			BasePage.captureScreenShot(testMethodName, driver);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());
	}

	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " test case started");
	}

	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :" + Result.getName());
	}

}
