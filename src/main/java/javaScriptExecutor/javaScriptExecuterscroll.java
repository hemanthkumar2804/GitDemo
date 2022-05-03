package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecuterscroll {

	@Test
	public void scroll() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// jse.executeScript("window.scrollTo(0,500)");
		// Thread.sleep(3000);
		// jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		// WebElement lastButton=driver.findElement(By.linkText("Last"));
		// jse.executeScript("window.scrollTo(arguments[0],arguments[1])",
		// lastButton.getLocation().x,lastButton.getLocation().y);
		jse.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.quit();
	}

}
