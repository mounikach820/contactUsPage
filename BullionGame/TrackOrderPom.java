package BullionGame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackOrderPom {
	WebDriver driver;


	@FindBy(xpath = "//a[@class='btn btn-color-primary btn-style-default btn-style-rectangle btn-size-default']") public WebElement TrackOrderBtn;
	@FindBy(xpath="//*[@id='orderid']") public WebElement Oderid;
	@FindBy(xpath="//*[@id='order_email']") public WebElement Email;
	@FindBy(xpath="//*[@name='track']") public WebElement Trackbn;
	public TrackOrderPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
