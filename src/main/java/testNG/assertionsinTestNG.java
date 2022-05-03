package testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertionsinTestNG {

	@Test(enabled=false)
	public void publictestNGAsserations() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hyr tutorials", Keys.ENTER);
		String expectedTitel="hyr tutorials - Google Search";
		String actualTitel=driver.getTitle();
		assertEquals(actualTitel, expectedTitel,"Title mismatch");
		driver.quit();;

	}
	
	@Test
	public void testFacebook() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hemanth", Keys.ENTER);
		Thread.sleep(5000);
		SoftAssert softassert=new SoftAssert();
		String actualTitle=driver.getTitle();
		String expectedlTitle="Log in to Facebook";		
		softassert.assertEquals(actualTitle, expectedlTitle, "Title is not matching");
		String expectedURL="https://www.facebook.com/";
		String actualURL=driver.getCurrentUrl();
		softassert.assertNotEquals(actualURL, expectedURL, "URL will not matching");
		String actualMessage=driver.findElement(By.xpath("//form[@id='login_form']/div/div[2]/div[2]")).getText();
		String expectedMessage="The password that you've entered is incorrect. Forgotten password?";
		softassert.assertEquals(actualMessage, expectedMessage, "Username text not matching");
		driver.quit();
		softassert.assertAll();

	}

}
