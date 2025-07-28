package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlyTesting {
	@Test
	public void TestPopups() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");
		driver.manage().window().maximize();
	
		driver.findElement(By.name("FirstName")).sendKeys("Dheeraj");
		driver.findElement(By.name("LastName")).sendKeys("Raj");
		driver.findElement(By.name("EmailID")).sendKeys("dheerajrajappikonda@gmail.com");
		driver.findElement(By.name("MobNo")).sendKeys("8143763439");
		driver.findElement(By.name("Company")).sendKeys("OFSS");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alert.accept();
		driver.quit();
	}	
}