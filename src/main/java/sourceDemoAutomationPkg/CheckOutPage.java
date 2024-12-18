package sourceDemoAutomationPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

	WebDriver CheckOutPageDriver;
	
	public CheckOutPage(WebDriver driver) {
		this.CheckOutPageDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="first-name")
	WebElement userFirstNameElement;
	
	@FindBy (id="last-name")
	WebElement userLastNameElement;
	
	@FindBy (id="postal-code")
	WebElement userPostalCodeElement;
	
	@FindBy (id="continue")
	WebElement continueBtnElement;
	
	@FindBy (xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement OverViewLabel;
	
	@FindBy (id="finish")
	WebElement finishBtnElement;
	
	@FindBy (xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement FinishCheckoutLabel;
	
	
	public void enterFirstName(String fName) {
		userFirstNameElement.sendKeys(fName);
	}
	
	public void enterLastName(String lName) {
		userLastNameElement.sendKeys(lName);
	}
	
	public void enterZipCode(String zipCode) {
		userPostalCodeElement.sendKeys(zipCode);
	}
	
	public void clickContinueBtn() {
		continueBtnElement.click();;
	}
	
	public boolean confirmOverViewPageNavigation() 
	{
		boolean overViewLblVisibility = OverViewLabel.isDisplayed();
		return overViewLblVisibility;
	}
	
	public void clickFinishBtn() {
		finishBtnElement.click();;
	}
	
	
	public boolean confirmFinishCheckOutPageNavigation() 
	{
		boolean finishCheckoutLblVisibility = FinishCheckoutLabel.isDisplayed();
		return finishCheckoutLblVisibility;
	}
}
