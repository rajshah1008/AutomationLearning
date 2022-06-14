package pageRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By Xpath = By.xpath("//input[@id=\"login1\"]");
	By id  = By.id("password");
	By name = By.name("proceed");
	By Amazon = By.xpath("//a[@text()=\"Fashion\"]");
			
	
	public WebElement EmailField() 	
	{
     
	   return driver.findElement(Xpath);	
	}
	
	public WebElement Password() {
		return driver.findElement(id);
	}
	
	public WebElement Login() {
		return driver.findElement(name);
	}
	
	public WebElement Amazon() {
		
	   return driver.findElement(Amazon);
	}
	
	
	
}