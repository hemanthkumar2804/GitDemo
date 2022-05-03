package seleniumInterviewQuesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertionInTestNG {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String ActrualResult=driver.getTitle();
		String ExpectedResult="Google";
		Assert.assertEquals(ActrualResult, ExpectedResult,"Title Missmatch");
		driver.quit();

	}

}
