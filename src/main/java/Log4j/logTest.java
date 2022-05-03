package Log4j;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logTest {

	private static Logger log = Logger.getLogger(logTest.class);

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		log.info("Lunched URL");
		log.error("eror message");
		log.info("Lunched Scessfully");
		log.debug("Debugger message");
		driver.quit();

	}

}
