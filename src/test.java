import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	
	public static void main(String[] args) throws Exception  {
		
		// To set the properties we make use of webdriver manager dependencies  
		WebDriverManager.chromedriver().setup();         
		WebDriver driver = new ChromeDriver();
		//To maximize the window
		driver.manage().window().maximize();
	 driver.get("https://ultimateqa.com/automation");
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
	
	
	

}
