package sample.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver", "D:\\projects\\first project\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}

}
