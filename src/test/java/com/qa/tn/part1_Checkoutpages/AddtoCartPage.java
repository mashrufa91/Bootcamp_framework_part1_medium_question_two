package com.qa.tn.part1_Checkoutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
	
	
	

	public WebDriver driver;
	
	@FindBy(linkText= "HP LP3065")
	private WebElement validProduct;
	
	//@FindBy(xpath="//button[@id='button-cart']")
	//private WebElement addTocartButton;
	
	@FindBy(xpath= "//div[@class= 'alert alert-success alert-dismissible']")
	private WebElement validProductSuccessfulyAdded;
	
	@FindBy(xpath="//button[contains(@class, 'btn btn-inverse')]")
	private WebElement addForcheckout;
		
	@FindBy(linkText= "Checkout")
	private WebElement checkOut;
	
	public AddtoCartPage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
	
	
public boolean varifyMessageofProductAddedDisplayed(){
	
	boolean validProduct= validProductSuccessfulyAdded.isDisplayed();
	return validProduct;}
	
//public void clickOnAddtoCart() {

    //   addTocartButton.click();
	
//}
public void clickOnAddForCheckout() {
	addForcheckout.click();
	 
}
public CheckOutPage clickOnCheckout() {
	checkOut.click();
	return new CheckOutPage(driver);
}
}

