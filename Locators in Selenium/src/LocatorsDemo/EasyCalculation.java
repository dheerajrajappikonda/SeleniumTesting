package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EasyCalculation {
	
	WebDriver driver;
	
	@Test
	public void EasyCalculation() {
		driver = new ChromeDriver();
		driver.get("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
	}
}
