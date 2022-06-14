import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raaj\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://google.com");
		//*[@id="input"]
		driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Rahul Shetty Academy");

	}

}
