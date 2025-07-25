package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://login.yahoo.com");
		String URL = driver.getCurrentUrl();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
}
