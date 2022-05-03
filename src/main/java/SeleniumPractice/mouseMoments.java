package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseMoments {
	public WebDriver driver;

	@Test
	public void mouseMoment() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Actions ac = new Actions(driver);
		ac
		.moveToElement(driver.findElement(By.xpath("//a[.='Admin']")))
		.moveToElement(driver.findElement(By.xpath("//a[.='Organization']")))
		.moveToElement(driver.findElement(By.xpath("//a[.='Locations']")))
		.click().
		perform();
		Thread.sleep(3000);
		WebElement LocatioName=driver.findElement(By.id("searchLocation_name"));
		LocatioName.sendKeys("Hemanth");
		ac.doubleClick(LocatioName).perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
