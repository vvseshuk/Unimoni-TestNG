package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenCapture {
	
	WebDriver driver;
	
	@Test
	public void tryCapture() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		try {
			WebElement notFindable = driver.findElement(By.xpath("//a/li"));
			notFindable.click();
		} catch (Exception e) {
			captureScreen(driver);
			Assert.fail();			
		}	
		driver.quit();
	}

	private void captureScreen(WebDriver driver2) throws Exception {
		//fails if there is any popups on the screen - it is a limitation to this feature
		File screen = ((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen, new File("C:\\SCREENSHOTS\\tryCapture.png"));
		System.out.println("Placed the file in:" + "C:\\SCREENSHOTS\\tryCapture.png");
	}

}
