package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecuterforenteringtext {
	
	@Test
	public void JsExecutorforEnteringText() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.id("email"));
		//jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("arguments[0].value='abc@gmail.com'", element);
		Thread.sleep(5000);
		String text=(String)jse.executeScript("return document.getElementById('email').value");
		System.out.println(text);
		driver.quit();
		
		
		
		
	}

}
