package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExampleListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test got started: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test got success: " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test got failed:" + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test got skipped:" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("In onStart method...");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("In onFinish method...");
	}

}
