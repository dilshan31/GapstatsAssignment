package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	 //test
	public void homePage(WebDriver driver) {
		
		this.driver = driver;
	}
	

	By tf_abTesting = By.xpath("//a[@href='/abtest']");
	By tf_addremove = By.xpath("//a[@href='/add_remove_elements/']");
	By tf_basicAuth = By.xpath("//a[@href='/basic_auth']");
	By tf_brokenImages = By.xpath("//a[@href='/broken_images']");
	By tf_challengingDom = By.xpath("//a[@href='/challenging_dom']");
	


public void ClickFunction() {
	
	
	driver.findElement(tf_abTesting).click();
	driver.findElement(tf_addremove).click();
	driver.findElement(tf_basicAuth).click();
	driver.findElement(tf_brokenImages).click();
	driver.findElement(tf_challengingDom).click();
}

}
