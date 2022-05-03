package newForPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorsinSelenium {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1.Id 
		 * 2.Name 
		 * 3.ClassName 
		 * 4.TagName 
		 * 5.Linktext 
		 * 6.Partial linktext
		 * 7.XPath
		 * 8.CSS Selector
		 */
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		Thread.sleep(200);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("pass")).sendKeys("test01");
		Thread.sleep(200);
		driver.findElement(By.name("pass")).clear();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten ")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Testid");
		Thread.sleep(800);
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("testpassword");
		Thread.sleep(800);
		driver.quit();
		
	}

}
