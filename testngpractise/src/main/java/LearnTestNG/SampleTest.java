package LearnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void verifyTitle() {
		System.setProperty("webdriver.gecko.driver", "/home/kuldeep/Downloads/geckodriver");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://gmail.com");
	String Actual = driver.getTitle();
	Assert.assertEquals(Actual,"Gmail");


}
}
