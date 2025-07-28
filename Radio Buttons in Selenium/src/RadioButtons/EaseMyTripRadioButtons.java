package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EaseMyTripRadioButtons {
	
	@Test
	public void NoofRadioButtons() throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/?");
		
		int radiobtn = driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println("No of Radio Buttons...."+ radiobtn);
	}
}