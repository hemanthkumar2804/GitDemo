package parct001;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10, 500);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testproject.io/");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!window.endsWith(parentwindow)) {
				driver.switchTo().window(window);
				wait.until(a ->a.findElement(By.id("username")).isDisplayed() );
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				driver.findElement(By.id("username")).sendKeys("testusername");
				Thread.sleep(5000);
				driver.close();
			}

		}
		driver.switchTo().window(parentwindow);
		Thread.sleep(5000);
		driver.quit();

	}

}
