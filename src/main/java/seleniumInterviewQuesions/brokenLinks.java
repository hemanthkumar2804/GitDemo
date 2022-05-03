package seleniumInterviewQuesions;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(9000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			String linkURL = link.getAttribute("href");
			URL url = new URL(linkURL);
			URLConnection urlconnection = url.openConnection();
			HttpsURLConnection httpurlconnection = (HttpsURLConnection) urlconnection;
			httpurlconnection.setConnectTimeout(9000);
			httpurlconnection.connect();
			if (httpurlconnection.getResponseCode() != 200) {

				System.err.println(httpurlconnection.getResponseCode() + " :" + httpurlconnection.getURL());
			}
			httpurlconnection.disconnect();
		}
		driver.quit();
	}

}
