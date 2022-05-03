package parct001;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandels {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String ParentWindowHandel = driver.getWindowHandle();
		System.out.println(ParentWindowHandel);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handels = driver.getWindowHandles();
		System.out.println(handels);
		for (String handel : handels) {
			if (!handel.equals(ParentWindowHandel)) {
				driver.switchTo().window(handel);
				driver.findElement(By.id("firstName")).sendKeys("Hemanth");
				Thread.sleep(500);
				driver.close();
			}
		}
		driver.switchTo().window(ParentWindowHandel);
		driver.findElement(By.id("name")).sendKeys("ChirasmiHemanth");
		Thread.sleep(500);
		driver.quit();


	}

}
