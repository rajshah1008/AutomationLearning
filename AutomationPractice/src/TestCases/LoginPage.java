package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageRepository.RediffLoginPage;

public class LoginPage {
	
	@Test
	public void LoginInfo() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raaj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in");
		
		 RediffLoginPage rd = new RediffLoginPage(driver);
		// rd.EmailField().sendKeys("raj.shah@capgemini.com");
		// rd.Password().sendKeys("test");
		// rd.Login().click();
		 rd.Amazon().click();
	}
	
	

}
