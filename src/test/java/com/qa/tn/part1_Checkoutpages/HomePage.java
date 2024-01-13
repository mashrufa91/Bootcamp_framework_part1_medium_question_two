package com.qa.tn.part1_Checkoutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	public WebDriver driver;
	
	@FindBy(linkText = "My Account")
	private WebElement myAccountDropdown;
	
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	
	
	@FindBy(linkText = "Register")
	private WebElement registerOption;
	
	
	@FindBy(name = "search")
	private WebElement searchTextBoxField;
	
	
	@FindBy(css = "button.btn.btn-default.btn-lg")
	private WebElement searchButton;
	
	@FindBy(linkText = "Qafox.com")
	private WebElement homePageStatus;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public void clickOnMyAccountDropDownMenu() {
		myAccountDropdown.click();
	}
	
	
	
	public void enterProductDetail() {
		searchTextBoxField.sendKeys("HP");
	}
	
	public SearchProductPage clickOnSearchIcon() {
		searchButton.click();
		return new SearchProductPage(driver);
	}
	
	public SearchProductPage navigateToSearchPage(String productNameText) {
		searchTextBoxField.sendKeys(productNameText);
		searchButton.click();
		return new SearchProductPage(driver);
	}
	
public boolean displayOFHomePage() {
	boolean displayHomeStatus= homePageStatus.isDisplayed();
	return displayHomeStatus;
	
}

}

