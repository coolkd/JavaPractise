package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTesting {
	
	
	public static void main (String [] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.gecko.driver", "/home/kuldeep/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kdcool86");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("turnmeon");
		
		WebElement Loginbutton = driver.findElement(By.id("loginbutton"));
		
		Loginbutton.click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userNavigationLabel")));
		
		WebElement click = driver.findElement(By.id("userNavigationLabel"));
		click.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log out']")));
		WebElement Logout = driver.findElement(By.xpath("//span[text()='Log out']"));
		Logout.click();
	
		//WebElement profile = driver.findElement(By.xpath("//a[@accesskey='2']"));
		
		//profile.click();
	}

}
