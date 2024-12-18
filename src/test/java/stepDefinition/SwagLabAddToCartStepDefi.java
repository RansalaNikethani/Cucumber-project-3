package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sourceDemoAutomationPkg.ProductPage;

public class SwagLabAddToCartStepDefi  {
	
	WebDriver driver;
	ProductPage productPage;
	@Test
	@Given("User need to open the product page")
	public void user_need_to_open_the_product_page() throws InterruptedException {
		productPage = new ProductPage(SwagLabsStepDefi.driver); 
		Thread.sleep(3000);
	}
	
	@When("User click sauce labs bolt tshirt add to cart")
	public void user_click_sauce_labs_bolt_tshirt_add_to_cart() throws InterruptedException {
		productPage.clickBoltTshirtAddtoCartBtn();
		Thread.sleep(3000);
	}
	
	@When("User click tshirt red add to cart")
	public void user_click_tshirt_red_add_to_cart() throws InterruptedException {
		productPage.clickRedTshirtAddtoCartBtn();
		Thread.sleep(5000);
	}
	
	@Then("two items should be visible in the cart icon")
	public void two_items_should_be_visible_in_the_cart_icon() throws InterruptedException {
		productPage = new ProductPage(SwagLabsStepDefi.driver); 
		Assert.assertEquals("2", productPage.countTotal());
		System.out.println("yes count is correct");
		Thread.sleep(3000);
	}
	
	@When("click the cart icon should navigate to cart page")
	public void click_the_cart_icon_should_navigate_to_cart_page() throws InterruptedException {
		productPage.clickCartIcon();
		Thread.sleep(4000);
	}
	
	@When("click the checkout button")
	public void click_the_checkout_button() throws InterruptedException {
		productPage.clickCheckoutBtn();
		Thread.sleep(5000);
		
	}
	
	@Then("User need to navigate to the checkout page")
	public void user_need_to_navigate_to_the_checkout_page() throws InterruptedException {
		productPage = new ProductPage(SwagLabsStepDefi.driver); 
		if(productPage.confirmCheckoutPageNavigation()==true) {
			System.out.println("Successfully Navigated to checkout page");
		}
		else {
			System.out.println("not Navigated");
		}
		Thread.sleep(5000);
	}


}
