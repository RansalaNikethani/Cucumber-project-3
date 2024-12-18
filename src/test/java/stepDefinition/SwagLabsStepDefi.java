package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sourceDemoAutomationPkg.DriverCreate;
import sourceDemoAutomationPkg.LoginPage;

public class SwagLabsStepDefi extends DriverCreate{
	
	static WebDriver driver;
	@BeforeTest
	@Given("As a user need to open the login page")
	public void as_a_user_need_to_open_the_login_page()
	{
	    driver = ImportDriverObjMthd();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	}

	@When("User enter correct user name")
	public void user_enter_correct_user_name()
	{
		LoginPage loginObj = new LoginPage(driver);
		loginObj.enterUserName("standard_user");
	}

	@When("User enter correct password")
	public void user_enter_correct_password() throws InterruptedException
	{
		LoginPage loginObj = new LoginPage(driver);
		loginObj.enterPwd("secret_sauce");
		Thread.sleep(2000);
	}

	@When("User click login button")
	public void user_click_login_button() throws InterruptedException
	{
		LoginPage loginObj = new LoginPage(driver);
		loginObj.clickLoginBtn();
		Thread.sleep(4000);
	}

	@Then("User need to navigate to the product home page")
	public void user_need_to_navigate_to_the_product_home_page() throws InterruptedException {
		LoginPage loginObj = new LoginPage(driver);
		
		if(loginObj.confirmNavigation()==true) {
			System.out.println("Successfully Navigated to the product page");
		}
		else {
			System.out.println("not Navigated");
			Thread.sleep(5000);
		}
		
	}

}
