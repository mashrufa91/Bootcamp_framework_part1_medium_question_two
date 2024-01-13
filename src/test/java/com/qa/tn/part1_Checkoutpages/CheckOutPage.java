package com.qa.tn.part1_Checkoutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

public WebDriver driver;

@FindBy(xpath= "//h2[(contains(text(),'New Customer'))]")
private WebElement statusOfCheckoutOption;


@FindBy(xpath="//input[@name='account' and @value='guest']")
private WebElement guestUserForCheckOut;

@FindBy(xpath="//input[@id='button-account']")
private WebElement continueButton;


@FindBy(xpath="//input[@id='button-account']")
private WebElement continuRegisterButton;



public CheckOutPage(WebDriver driver) {
	
	this.driver= driver;
	PageFactory.initElements(driver, this);
}


public boolean getStatusofCheckoutOptionsDisplayed() {
	boolean displayCheckoutStatus= statusOfCheckoutOption.isDisplayed();
	return displayCheckoutStatus;}



public void clickOnContinueRegisterButton() {
	continuRegisterButton.click();
}
public void clickOnGuestUserforCheckout() {
	guestUserForCheckOut.click();
}



}