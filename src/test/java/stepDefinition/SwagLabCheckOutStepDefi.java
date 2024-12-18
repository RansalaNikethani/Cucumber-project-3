package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sourceDemoAutomationPkg.CheckOutPage;

public class SwagLabCheckOutStepDefi {

	WebDriver driver;
	CheckOutPage checkOutPage;
	
	@AfterTest
	@Given("User need to open the checkout page")
	public void user_need_to_open_the_checkout_page() throws InterruptedException {
		checkOutPage = new CheckOutPage(SwagLabsStepDefi.driver);
		Thread.sleep(2000);
	}

	@When("User enter first name")
	public void user_enter_first_name() {
		checkOutPage.enterFirstName("Hiruni");
	}

	@When("User enter last name")
	public void user_enter_last_name() {
		checkOutPage.enterLastName("Perera");
	}

	@When("User enter zip code")
	public void user_enter_zip_code() throws InterruptedException {
		checkOutPage.enterZipCode("012525");
		Thread.sleep(2000);
	}

	@When("User click continue button")
	public void user_click_continue_button() throws InterruptedException {
		checkOutPage.clickContinueBtn();
		Thread.sleep(4000);
	}

	@Then("User need to navigate to checkout overview page")
	public void user_need_to_navigate_to_checkout_overview_page() throws InterruptedException {
		checkOutPage = new CheckOutPage(SwagLabsStepDefi.driver);
		
		if(checkOutPage.confirmOverViewPageNavigation()==true) {
			System.out.println("Successfully Navigated to overview page");
		}
		else {
			System.out.println("not Navigated");
		}
		Thread.sleep(5000);
	}

	@Then("User click finish button")
	public void user_click_finish_button() throws InterruptedException {
		checkOutPage.clickFinishBtn();
		Thread.sleep(2000);
	}

	@Then("User need to navigate to checkout complete page")
	public void user_need_to_navigate_to_checkout_complete_page() throws InterruptedException {
		checkOutPage = new CheckOutPage(SwagLabsStepDefi.driver);
		
		if(checkOutPage.confirmFinishCheckOutPageNavigation()==true) {
			System.out.println("Successfully Navigated to checkout finishing page");
		}
		else {
			System.out.println("not Navigated");
		}
		Thread.sleep(3000);
	}

}
