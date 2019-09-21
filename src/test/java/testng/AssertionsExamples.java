package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsExamples {
	
	@Test
	public void softAssertion() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Soft assertion started..");
		softAssert.assertTrue(false, "Failed soft assertion..");
		System.out.println("Could print..");
		softAssert.assertAll();
		
	}
	
	@Test
	public void hardAssertion() {
		System.out.println("Hard assertion started..");
		Assert.assertTrue(false, "Failing because some condition not met");
		System.out.println("Could not print..");
	}

}
