package BullionGame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUs {
WebDriver driver;
PomContactUsForm sb1;
@Given("Open the browser and enter the URL")
public void open_the_browser_and_enter_the_URL() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	driver.get("https://bulliongamestg.wpengine.com/");

	driver.manage().window().maximize();
	Thread.sleep(2000);
	sb1=new PomContactUsForm(driver);

}

@Then("Go to footer section and click on Contact us link")
public void go_to_footer_section_and_click_on_Contact_us_link() throws InterruptedException {
    
	sb1.ContactUs.click();
}

@Then("enter the Your name")
public void enter_the_Your_name() throws InterruptedException {
	Thread.sleep(2000);
   sb1.yourname.sendKeys("Bhavani");
}

@Then("enter your email in the email textbox")
public void enter_your_email_in_the_email_textbox() throws Throwable {
	Thread.sleep(2000);
   sb1.email.sendKeys("bhavanir049@gmail.com");
}

@Then("enter phone number")
public void enter_phone_number() throws InterruptedException {
    sb1.PhoneNumber.sendKeys("7731008871");
    Thread.sleep(2000);
    sb1.Yourmsg.sendKeys("Testing the apllication");
}

@Then("click on Ask a quation button")
public void click_on_Ask_a_quation_button() {
    sb1.Askbtn.click();
}
}
