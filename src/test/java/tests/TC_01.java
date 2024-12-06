package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class TC_01 {
	
	@BeforeTest
	public void TC_01() {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://the-internet.herokuapp.com/");
		
		HomePage homepage = new HomePage();
		homepage.ClickFunction();
		
	}
	
	
	
	
}
