package TestNGPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotations {

	WebDriver driver;

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("Test");
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
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
		
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After class");
		driver.quit();
	}

	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite");

	}

}
