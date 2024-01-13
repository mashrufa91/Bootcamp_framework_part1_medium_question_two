package com.qa.tn.part1_Checkoutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {
public WebDriver driver;

@FindBy(xpath="//div/ul/li[text()='Product Code:Product 21']")
private WebElement validProductCode;


@FindBy(xpath="//button[@id='button-cart']")
private WebElement AddtoCartButtoninInfoPage;

public ProductInfoPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	public boolean statusValidProductCodeDisplayed() {
		boolean validProductinfoDisplayed= validProductCode.isDisplayed();
		return validProductinfoDisplayed;
		
	}
	
	public AddtoCartPage clickOnAddtoCartinProductInfopage() {
		AddtoCartButtoninInfoPage.click();
		return new AddtoCartPage(driver);
		
	}
	
	
}
