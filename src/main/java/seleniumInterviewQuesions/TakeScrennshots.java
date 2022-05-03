package seleniumInterviewQuesions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScrennshots {

	static RemoteWebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		takeScreenshots("./Screenshots/Image3.jpeg");
		WebElement SecElement=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		takescreenshotforscetion(SecElement,"./Screenshots/Image4.jpeg");
		WebElement element=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		takescreenshotofelement(element,"./Screenshots/Image5.jpeg");
		driver.quit();
	}

	public static void takeScreenshots(String str) throws IOException {
		TakesScreenshot ts = driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File descFile = new File(str);
		FileUtils.copyFile(srcFile, descFile);
	}
	public static void takescreenshotforscetion(WebElement element,String str) throws IOException {
		File srcFile=element.getScreenshotAs(OutputType.FILE);
		File descFile = new File(str);
		FileUtils.copyFile(srcFile, descFile);
	}
	public static void takescreenshotofelement(WebElement element,String str) throws IOException {
		File scrFile=element.getScreenshotAs(OutputType.FILE);
		File desctFile=new File(str);
		FileUtils.copyFile(scrFile, desctFile);
	}

}
