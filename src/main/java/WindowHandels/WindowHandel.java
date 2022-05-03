package WindowHandels;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandel {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		System.out.println("--Window Handel--");
		String ParentWindowHandel = driver.getWindowHandle();
		System.out.println("Parent window handel"+" "+ ParentWindowHandel);
		driver.findElement(By.id("name")).sendKeys("ChirasmiHemanth");
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(3000);
		System.out.println("--how to handel window handels---");
		Set<String>WindowHandels=driver.getWindowHandles();
		for (String WindowHandel : WindowHandels) {
			System.out.println(WindowHandel);
			if(!ParentWindowHandel.equals(WindowHandel)) {
				driver.switchTo().window(WindowHandel);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("HemanthKumar");
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(ParentWindowHandel);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("RoopaHemanth");
		Thread.sleep(3000);
		driver.quit();

	}

}
