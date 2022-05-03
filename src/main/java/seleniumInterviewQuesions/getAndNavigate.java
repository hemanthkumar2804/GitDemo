package seleniumInterviewQuesions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAndNavigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		String url = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
		driver.navigate().to(url);
		Thread.sleep(3000);
		driver.navigate().back();// facebook
		Thread.sleep(3000);
		driver.navigate().back();// google
		Thread.sleep(3000);
		driver.navigate().forward();//facebook
		Thread.sleep(3000);
		driver.navigate().refresh();//facebook refresh
		Thread.sleep(3000);
		driver.quit();

	}

}
