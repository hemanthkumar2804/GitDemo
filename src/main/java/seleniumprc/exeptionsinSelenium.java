package seleniumprc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exeptionsinSelenium {
	
	@Test
	public void exep() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		try
		{
		driver.findElement(By.id("firstNames")).sendKeys("Hemanth");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Handled NoSuchElementException");
		}
		finally {
		driver.quit();
		}
		
	}

}
