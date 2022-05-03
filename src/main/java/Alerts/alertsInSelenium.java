package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsInSelenium {
	
	@Test
	public void alerts() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement alert01=driver.findElement(By.id("alertBox"));
		alert01.click();
		Alert alertBox=driver.switchTo().alert();
		System.out.println(alertBox.getText());
		alertBox.accept();
		WebElement alert02=driver.findElement(By.id("confirmBox"));
		alert02.click();
		Alert confirmBox=driver.switchTo().alert();
		System.out.println(confirmBox.getText());
		confirmBox.accept();
		WebElement alert03=driver.findElement(By.id("promptBox"));
		alert03.click();
		Alert promptBox=driver.switchTo().alert();
		Thread.sleep(3000);
		promptBox.sendKeys("HemanthKumar S");
		Thread.sleep(3000);
		promptBox.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		Thread.sleep(3000);
		
		
		
		
		driver.quit();
		
		
		
	}

}
