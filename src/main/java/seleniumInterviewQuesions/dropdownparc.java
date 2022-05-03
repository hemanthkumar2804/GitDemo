package seleniumInterviewQuesions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownparc {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement CourseName=driver.findElement(By.id("course"));
		Select select=new Select(CourseName);
		select.selectByVisibleText("Java");
		Thread.sleep(3000);
		List<WebElement>list=select.getOptions();
		for (int i = 0; i < list.size();i++) {
			String elemnts=list.get(i).getText();
			System.out.println(elemnts);
			
		}
		driver.close();

	}

}
