package TestNGPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseMomentsinSelenium {

	@Test(priority=1,enabled=true)
	public void mouseOver() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("ID: "+Thread.currentThread().getId());
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule")))
				.moveToElement(driver.findElement(By.id("menu_admin_Organization")))
				.moveToElement(driver.findElement(By.id("menu_admin_viewLocations"))).click().perform();
		Thread.sleep(5000);
		WebElement loacationelement=driver.findElement(By.id("searchLocation_name"));
		loacationelement.sendKeys("Hemanth");
		Thread.sleep(5000);
		action.doubleClick(loacationelement).perform();
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(priority=0,enabled=false)
	public void contextClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		System.out.println("ID: "+ Thread.currentThread().getId());
		Actions ac=new Actions(driver);
		ac.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Edit']")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
