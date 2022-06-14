package pageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YoutubeObject {

	WebDriver driver;
	
	public YoutubeObject() {
		this.driver = driver;
	}
	
	By Search = By.cssSelector("div.ytd-searchbox-spt");
	
	
     public WebElement Search()
     {
	  return driver.findElement(Search);
     }

}
