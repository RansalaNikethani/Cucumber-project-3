package sourceDemoAutomationPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver productPageDriver;
	
	public ProductPage(WebDriver driver) {
		this.productPageDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement boltTshirtAddtoCartBtnElement;
	
	@FindBy (xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement redTshirtAddtoCartBtnElement;
	
	public void clickBoltTshirtAddtoCartBtn() {
		boltTshirtAddtoCartBtnElement.click();
	}
	
	public void clickRedTshirtAddtoCartBtn() {
		redTshirtAddtoCartBtnElement.click();
	}
	
	@FindBy (xpath="//*[@id=\"shopping_cart_container\"]/a/span")
	WebElement CartCount;
	
	public String countTotal() {
		String totalCount = CartCount.getText();
		return totalCount;
	}
	
	@FindBy (xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartIconElement;
	
	public void clickCartIcon() {
		cartIconElement.click();
	}
	
	
	@FindBy (xpath="//*[@id=\"checkout\"]")
	WebElement checkoutBtnElement;
	
	public void clickCheckoutBtn() {
		checkoutBtnElement.click();
	}	
	
	@FindBy (xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement checkoutLabel;

	public boolean confirmCheckoutPageNavigation() 
	{
		boolean checkoutLblVisibility = checkoutLabel.isDisplayed();
		return checkoutLblVisibility;
	}

}
