package BullionGame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PomLogin {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[1]/header/div/div[2]/div/div/div[3]/div[2]/a/span[2]") public WebElement LoginRegister;
	@FindBy(xpath="//div[@class='login-dropdown-inner']/span/following-sibling::form/p/label/following-sibling::input[@id='username']") public WebElement UsernameTextbox;
	@FindBy(xpath="//div[@class='login-dropdown-inner']/span/following-sibling::form/p/label/following-sibling::input[@id='password']") public WebElement PasswordTextbox;
	@FindBy(xpath="//span/following-sibling::form/p[3]/input[2]/following-sibling::button[@name='login']") public WebElement VerifyLogin;
	@FindBy(xpath="/html/body/div[1]/header/div/div[3]/div/div/div[1]/div/a/img") public WebElement HomePage;
	@FindBy(xpath="//*[@id=\"menu-item-8834\"]/a/span") public WebElement Gold;
	@FindBy(xpath="//*[@id=\"menu-item-8845\"]/a") public WebElement Goldcoins;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div/div[4]/div[1]/div/a") public WebElement USMint;
	@FindBy(xpath="//div[1]/div/div[1]/div[2]/div[1]/a") public WebElement AddtoCart;
	@FindBy(xpath="//a[@href='https://bulliongamestg.wpengine.com/checkout/' and @class='checkout-button button alt wc-forward']") public WebElement ProceedToCheckOut;

	@FindBy(xpath="//*[@id='billing_first_name']") public WebElement FirstName;
	@FindBy(xpath="//*[@id='billing_last_name']") public WebElement LastName;
	@FindBy(xpath="//*[@id='billing_company']") public WebElement CompanyName;
	@FindBy(xpath="//*[@id='billing_address_1']") public WebElement StreetAddress;
	@FindBy(xpath="//*[@id='billing_city']") public WebElement Town;
	@FindBy(xpath="//*[@id='billing_postcode']") public WebElement Zipcode;
	@FindBy(xpath="//*[@id='billing_phone']") public WebElement PhoneNum;
	@FindBy(xpath="//*[@id=\"customer_details\"]/div[1]/div/button") public WebElement validatebtn;
	@FindBy(xpath="//*[@id='terms']") public WebElement Radiobtn;
	@FindBy(xpath="//*[@id=\"place_order\"]") public WebElement Placeorder;
public PomLogin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
