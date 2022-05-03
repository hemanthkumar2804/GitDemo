package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAttribute {
	private static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.w3schools.com/");
		// attribute1();
		// Thread.sleep(3000);
		// attribute2();
		// Thread.sleep(3000);
		// XpathOperators();
		// Thread.sleep(3000);
		// XpathConditions();
		// Thread.sleep(3000);
		XpathFuncation();
		Thread.sleep(3000);
		driver.quit();

	}

	public static void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

	public static void attribute1() {

		driver.findElement(By.xpath("//a[@title=\"Search W3Schools\"]")).click();
	}

	public static void attribute2() {
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
	}

	// Xpath Operators
	public static void XpathOperators() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		// driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("Chirasmi");
		// driver.findElement(By.xpath("//input[@maxlength!=10]")).sendKeys("Hemanth");
		List<WebElement> elements = driver.findElements(By.xpath("//input[@maxlength>=10]"));
		for (WebElement webElement : elements) {
			highLighterMethod(driver, webElement);

		}
	}

	public static void XpathConditions() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		List<WebElement> element01 = driver
				.findElements(By.xpath("//input[@maxlength=10 or @name='name' and @type='text']"));
		System.out.println(element01.size());
		List<WebElement> element02 = driver
				.findElements(By.xpath("//input[@maxlength=10 and @name='name' and @type='text']"));
		System.out.println(element02.size());
		List<WebElement> element03 = driver
				.findElements(By.xpath("//input[not(@maxlength=10 and @name='name' and @type='text')]"));
		System.out.println(element03.size());
	}

	public static void XpathFuncation() {
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		//WebElement text = driver.findElement(By.xpath("//a[text()='Sign in into account']"));
		//highLighterMethod(driver, text);

		//WebElement conttext = driver.findElement(By.xpath("//div[contains(text(),'Please')]"));
		//highLighterMethod(driver, conttext);
		driver.findElement(By.xpath("//input[contains(@name,'name') and @maxlength=10]")).sendKeys("Chorasmi");
		WebElement normspace=driver.findElement(By.xpath("//label[normalize-space(text()='Firast Name')]"));
		highLighterMethod(driver,normspace);
		

	}

}
