package brokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findingBrokenLinksinanapp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links are: " + links.size());
		List<String> urlList = new ArrayList<String>();
		for (WebElement e : links) {
			String url = e.getAttribute("href");
			urlList.add(url);
			// brokenLinks(url);
		}
		long starttime = System.currentTimeMillis();
		urlList.parallelStream().forEach(e -> brokenLinks(e));
		long endtime = System.currentTimeMillis();
		// parallel streams=24423:24.4 sec
		//Sequential streams=297064: 3 mints
		System.out.println("time taken is:" + (endtime - starttime));
		driver.quit();
	}

	public static void brokenLinks(String linkurl) {

		try {
			URL url = new URL(linkurl);
			HttpURLConnection HttpURLConnection = (HttpURLConnection) url.openConnection();
			HttpURLConnection.setConnectTimeout(500);
			HttpURLConnection.connect();
			if (HttpURLConnection.getResponseCode() >= 400) {
				System.out.println(linkurl + "-->" + HttpURLConnection.getResponseMessage()
						+ HttpURLConnection.getResponseCode() + "-->" + "Is a broken Link");
			} else {
				System.out.println(
						linkurl + "-->" + HttpURLConnection.getResponseMessage() + HttpURLConnection.getResponseCode());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
