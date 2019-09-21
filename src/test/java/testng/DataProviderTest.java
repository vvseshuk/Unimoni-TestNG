package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "provider")
	public void login(String userName, String pwd, String dob) {
		// Create a Chrome driver. All test classes use this.
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Create a wait. All test classes use this.
		WebDriverWait wait = new WebDriverWait(driver, 15);

		// Maximize Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();
		driver.quit();

	}

	@DataProvider
	public Object[][] provider() {
		return new Object[][] { new Object[] { "mngr222872", "apamyhy", "12-03-2000" },
				new Object[] { "seshu", "apamyhy", "12-03-2001" } };
	}

}
