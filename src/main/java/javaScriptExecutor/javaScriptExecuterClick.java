package javaScriptExecutor;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecuterClick {

	@Test
	public void JsExecutorClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('femalerb').click()");
		Thread.sleep(5000);
		List<WebElement> elements=(List<WebElement>) jse.executeScript("return document.getElementsByName('language')");
		for (WebElement webElement : elements) {
			jse.executeScript("arguments[0].click()", webElement);			
		}
		Thread.sleep(5000);
		jse.executeScript("document.evaluate(\"//a[text()='Click here to navigate to the home page']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click()");
		Thread.sleep(5000);
		driver.quit();
	}
}
