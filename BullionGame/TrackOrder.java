package BullionGame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TrackOrder {
	WebDriver driver;
	TrackOrderPom sb;
	@Given("customer is able to click the Track Order button")
	public void customer_is_able_to_click_the_Track_Order_button() throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://bulliongamestg.wpengine.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		sb=new TrackOrderPom(driver);
		sb.TrackOrderBtn.click();
		
		
	}   
	

	@Then("customer is enter the valid Order Id")
	public void customer_is_enter_the_valid_Order_Id() throws Throwable {
		Thread.sleep(2000);
		sb.Oderid.sendKeys("10012");
	}

	@Then("customer enter the Billing emilid")
	public void customer_enter_the_Billing_emilid() throws Throwable {
	    sb.Email.sendKeys("durgabhavani0210@gmail.com");
	    Thread.sleep(2000);
	    sb.Trackbn.click();
	    		
	}

}
