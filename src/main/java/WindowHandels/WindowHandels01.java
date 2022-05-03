package WindowHandels;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandels01 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String ParentWindoHandel = driver.getWindowHandle();
		driver.findElement(By.id("name")).sendKeys("hemanth");
		System.out.println("Parent Window Handel is :" + ParentWindoHandel);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(3000);
		Set<String> WindowHandels02 = driver.getWindowHandles();
		for (String WindowHandel : WindowHandels02) {
			System.out.println(WindowHandel);
			if (!ParentWindoHandel.equals(WindowHandel)) {
				driver.switchTo().window(WindowHandel);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("RoopaHemanth");
				Thread.sleep(4000);
				driver.close();
			}
		}
		driver.switchTo().window(ParentWindoHandel);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("HemanthChirasmi");
		driver.quit();

	}

}
