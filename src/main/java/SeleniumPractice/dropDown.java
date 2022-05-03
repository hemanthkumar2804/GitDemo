package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement DropDown=driver.findElement(By.xpath("//select[@id='course']"));
		WebElement IDEDropDown=driver.findElement(By.xpath("//select[@id='ide']"));
		selectdropdown(DropDown,"java");
		Thread.sleep(3000);
		selectdropdown(IDEDropDown,"ij");
		Thread.sleep(3000);
		driver.quit();

	}
	
	public static void selectdropdown(WebElement element, String name) {
		Select Selectdropdown= new Select(element);
		Selectdropdown.selectByValue(name);
	}

}
