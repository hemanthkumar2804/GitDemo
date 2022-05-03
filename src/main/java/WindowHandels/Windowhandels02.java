package WindowHandels;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandels02 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String ParentHandel = driver.getWindowHandle();
		String WindowTitle = driver.getTitle();
		System.out.println(ParentHandel + " " + WindowTitle);
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> WindowHandels = driver.getWindowHandles();
		ArrayList<String> listofWindows = new ArrayList<>(WindowHandels);
		for (String string : listofWindows) {
			System.out.println(string + " " + driver.getCurrentUrl());
			if (!ParentHandel.equals(string)) {
				driver.switchTo().window(listofWindows.get(2));
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Hemanth");
				Thread.sleep(3000);
			}

		}
		driver.switchTo().window(ParentHandel);
		driver.findElement(By.id("name")).sendKeys("RoopaHemanth");
		Thread.sleep(3000);
		driver.quit();

	}

}
