package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageRepository.YoutubeObject;


public class YoutubeConnect {
        
	@Test
	public void Search() {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raaj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("www.youtube.com");
	  
	  YoutubeObject obj = new YoutubeObject();
	  obj.Search().sendKeys("Hello Youtube");
	  
	  
	  
  }
}
