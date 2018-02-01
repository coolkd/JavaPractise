import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlightBookingFlow {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<LoginData> dataCollection = new ArrayList<LoginData>();
		dataCollection.add(new LoginData("happy-hma travels-hsingh", "xxxxx"));
		dataCollection.add(new LoginData("jesup", "xxxxx"));

		WebDriver driver = null;

		System.setProperty("webdriver.gecko.driver", "/home/kuldeep/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://atlascycle:andromeda@stage-cpanel.hmatravel.com/travel-agency/v/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		for (LoginData data : dataCollection) {
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(data.get_username());
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(data.get_password());
			driver.findElement(By.xpath("//*[@id='travelagencyv-1749183305']/div/div[2]/div/div/div/div[3]/div/div[1]/div/div[5]/div")).click();
			Thread.sleep(5000);
			// driver.findElement(By.xpath("//span[@class='v-menubar-menuitem-caption']")).click();

			// driver.findElement(By.xpath("//span[text()='Sign Out']")).click();

			driver.findElement(By.xpath("//*[@id='flight-booking-panel-journey-type']/span[1]/label")).click();
			driver.findElement(By.xpath("//*[@id='flight-booking-panel-leaving-from']/input")).sendKeys("HYD");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr/td/span")).click();
			driver.findElement(By.xpath("//*[@id='flight-booking-panel-going-to']/input")).sendKeys("BOM");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr/td/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='flight-booking-panel-depart-date']/input")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='flight-booking-panel-depart-date']/input")).sendKeys("25/12/2017");
			driver.findElement(By.xpath("//*[@id='flight-booking-panel-adult']/input")).clear();
       		driver.findElement(By.xpath("//*[@id='flight-booking-panel-adult']/input")).sendKeys("2");
       		Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr/td")).click();
//			driver.findElement(By.xpath("//*[@id='flight-booking-panel-child']/input")).sendKeys("0");
//			driver.findElement(By.xpath("//*[@id='flight-booking-panel-infant']/input")).sendKeys("0");
//			driver.findElement(By.xpath("//*[@id='flight-booking-panel-class-of-service']/input")).sendKeys("Economy");
			driver.findElement(By.xpath("//*[@id='flight-booking-panel-preferred-carrier']/input")).sendKeys("Spicejet");
			driver.findElement(By.xpath("//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr/td")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Change Profile']")).click();
//			driver.findElement(By.xpath("//*[@id='gwt-uid-89']/span[2]/label"));
			driver.findElement(By.xpath("//span[@location='corporate-name']/div/div[2]/input")).sendKeys("Kelkar");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr/td/span")).click();
			driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/div/div/div[3]/div/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[5]/span[1]/div")).click();
			driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/div/div/div[3]/div/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[6]/div[2]/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/div/div")).click();
			Thread.sleep(2000);
		    driver.findElement(By.id("flight-booking-panel-search")).click();
		    Thread.sleep(20000);
		    driver.findElement(By.xpath("//div[@class='book_button'][1]/div/div")).click();
		    driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/div/div/div[3]/div/div[1]/div/div/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div/div/div")).click();
		    Thread.sleep(15000);
		    driver.findElement(By.xpath("//*[text()='Continue']")).click();
	        Thread.sleep(3000);
		    driver.findElement(By.xpath("//div[@role='combobox']/div")).click();
		    driver.findElement(By.xpath("//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr/td/span")).click();
		    driver.findElement(By.xpath("//textarea[@class='v-textarea v-widget']")).sendKeys("test");
		    driver.findElement(By.xpath("//span[text()='Save']")).click();
		    
		    
				
			
		    
			
			Thread.sleep(5000);
			 

		}

	}

}

class LoginData {

	private String _username;
	private String _password;

	public LoginData() {
		super();
	}

	public LoginData(String username, String password) {
		this.set_username(username);
		this.set_password(password);
	}

	public String get_username() {
		return _username;
	}

	private void set_username(String _username) {
		this._username = _username;
	}

	public String get_password() {
		return _password;
	}

	private void set_password(String _password) {
		this._password = _password;
	}

}
