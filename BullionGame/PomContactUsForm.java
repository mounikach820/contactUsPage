package BullionGame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomContactUsForm {
	WebDriver driver;

	@FindBy(xpath="//*[@id='menu-footer-menu-1']//a[@href='https://bulliongamestg.wpengine.com/contact-us/?v=47e5dceea252']") public WebElement ContactUs;
	@FindBy(xpath = "//*[@name='your-name']") public WebElement yourname;
	@FindBy(xpath="//*[@name='your-email']") public WebElement email;
	@FindBy(xpath="//*[@name='tel-767']") public WebElement PhoneNumber;
	@FindBy(xpath="//*[@name='text-1']") public WebElement CompanyName;
	@FindBy(xpath="//*[@name='your-message']") public WebElement Yourmsg;
	@FindBy(xpath="//*[@class='wpcf7-form-control has-spinner wpcf7-submit btn-color-black']") public WebElement Askbtn;
	
	
	public PomContactUsForm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
