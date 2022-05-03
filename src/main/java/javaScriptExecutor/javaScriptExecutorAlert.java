package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecutorAlert {
	
	@Test
	public void javaScriptAlertDemo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("alert('Hello')");
		Thread.sleep(500);
		driver.quit();
		
	}

}
