package TestNGPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test(priority=1)
public class XpathPart1 {

	public void absoluteXpath() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("/html/body/div[3]/a[4]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	@Test(priority=0)
	public void relativeXpath() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.w3schools.com/");
			driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
			Thread.sleep(5000);
			driver.quit();
	}

}
