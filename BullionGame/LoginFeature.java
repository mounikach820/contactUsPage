package BullionGame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFeature {
	WebDriver driver;
	PomLogin Sb;
	@Given("customer is on login page")
	public void customer_is_on_login_page() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://bulliongamestg.wpengine.com/");

		driver.manage().window().maximize();
	} 


	@When("customer clicks on login\\/register button")
	public void customer_clicks_on_login_register_button() throws Throwable {
		Sb=new PomLogin(driver);
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(Sb.LoginRegister).perform();

	}
	@When("customer enters valid username and passward")
	public void customer_enters_valid_username_and_passward() throws Throwable {
		Sb=new PomLogin(driver);
		Thread.sleep(3000);
		Sb.UsernameTextbox.sendKeys("durgabhavani0210@gmail.com");
		Thread.sleep(2000);
		Sb.PasswordTextbox.sendKeys("7731008871");
	}

	@When("customer clicks on login button")
	public void customer_clicks_on_login_button() {
		Sb=new PomLogin(driver);
		Sb.VerifyLogin.click();
	}

	@Then("customer is navigated to homepage")
	public void customer_is_navigated_to_homepage() {
		Sb.HomePage.click();	

	}
	@Then("Ckick on Gold Coins")
	public void ckick_on_Gold_Coins() {
		Actions a = new Actions(driver);
		a.moveToElement(Sb.Gold).perform();
		Sb.Goldcoins.click();

	}

	@Then("Select Any Product & go to Add to cart button")
	public void select_Any_Product_go_to_Add_to_cart_button() throws Throwable {
		Thread.sleep(3000);
		Sb.USMint.click();
		Thread.sleep(3000);
		Sb.AddtoCart.click();
	}

	@Then("Click on Proceed to checkout button")
	public void click_on_Proceed_to_checkout_button() throws InterruptedException {
		
		
		JavascriptExecutor jss=(JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(5000);
		Sb.ProceedToCheckOut.click();
	}

	@Then("Fill the Bulling details")
	public void fill_the_Bulling_details() throws Throwable {
		
		Sb.FirstName.clear();
		Sb.FirstName.sendKeys("Bhavani");
		Thread.sleep(3000);
		Sb.LastName.clear();
		Sb.LastName.sendKeys("Ravilala");
		Thread.sleep(2000);
		Sb.CompanyName.clear();
		Sb.CompanyName.sendKeys("RGT");
		Thread.sleep(3000);
		Sb.StreetAddress.clear();
		Sb.StreetAddress.sendKeys("1901 GATEWAY DR");
		Thread.sleep(3000);
		Sb.Town.clear();
		Sb.Town.sendKeys("IRVING");
		Thread.sleep(3000);
		Sb.Zipcode.clear();
		Sb.Zipcode.sendKeys("75038-2471");
		Thread.sleep(3000);
		Sb.PhoneNum.clear();
		Sb.PhoneNum.sendKeys("7731008871");
		Thread.sleep(3000);
		
		Sb.validatebtn.click();
		Thread.sleep(6000);
		Sb.Radiobtn.click();

	}

	@Then("place order")
	public void place_order() {
		Sb.Placeorder.click();
	}


}
