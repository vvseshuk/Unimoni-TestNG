package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {

	@Test
	public void testMethod1() {
		System.out.println("In test method1");
	}

	@Test
	public void testMethod2() {
		System.out.println("In test method2");
		//throw new RuntimeException();
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "testMethod2")
	public void testMethod3() {
		System.out.println("In test method3");
	}

}
