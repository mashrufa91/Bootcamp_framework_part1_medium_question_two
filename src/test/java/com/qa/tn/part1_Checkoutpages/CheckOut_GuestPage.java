package com.qa.tn.part1_Checkoutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_GuestPage {
	public WebDriver driver;

	
	@FindBy(linkText= "Step 2: Billing Details")
	private WebElement billingDetailDisplayed;

	@FindBy(xpath="//div[@id='collapse-payment-address']")
	private WebElement guestBillingfield;

	@FindBy(id="input-payment-firstname")
	private WebElement checkoutFirstname;

	@FindBy(id="input-payment-lastname")
	private WebElement checkoutLastname;
	@FindBy(id="input-payment-email")
	private WebElement checkoutEmail;

	@FindBy(id="input-payment-telephone")
	private WebElement checkoutTelephone;

	@FindBy(id="input-payment-password")
	private WebElement checkOutPassword;

	@FindBy(id="input-payment-confirm")
	private WebElement checkoutConfirmPassword;

	@FindBy(id="input-payment-address-1")
	private WebElement address1TextBox;

	@FindBy(id="input-payment-address-2")
	private WebElement address2TextBox;
	@FindBy(id="input-payment-city")
	private WebElement cityTextBox;
	@FindBy(id="input-payment-postcode")
	private WebElement postcodeTextBox;
	@FindBy(id="input-payment-country")
	private WebElement countryTextBox;

	@FindBy(id="input-payment-zone")
	private WebElement zoneTextBox;

	
	//div/descendant::input[@name='payment_address' and @value='existing']
	
	@FindBy(xpath="//input[@id='button-guest' and @value='Continue']")
	private WebElement continueAsGuest;

	


	@FindBy(xpath="//div/input[@id='button-guest-shipping']/following::div[@class='pull-right']/input[@id='button-shipping-method']")
	private WebElement continueDeliverymethodAsGuest;

	@FindBy(partialLinkText="Payment Method")
	private WebElement getStatusofPaymentmethod;

	@FindBy(xpath="//input[@name='payment_method']")
	private WebElement paymentMethod;

	@FindBy(xpath="//input[@name='agree']")
	private WebElement paymentMethodTandCAgree;

	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement paymentMethodContinue;

	@FindBy(partialLinkText="Confirm Order")
	private WebElement Confirmorderstatus;

	@FindBy(xpath="//div[@class='table-responsive']")
	private WebElement statusOfOrderInfo;

	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement confirmOrder;
       
	@FindBy(linkText="HP LP3065")
	private WebElement correctProduct;



	public CheckOut_GuestPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}


	
public boolean guestBillingFieldDisplayed() {
		
		boolean GuestBillingFieldDisplayed=guestBillingfield.isDisplayed();
		return GuestBillingFieldDisplayed;
		}

	public boolean BillingDetailsDisplayed() {
		
		boolean BillingDetailsDisplayed=billingDetailDisplayed.isDisplayed();
		return BillingDetailsDisplayed;
		}

		
	public void enterFirstName(String firstnametext) {
		checkoutFirstname.sendKeys(firstnametext);
	}

	public void enterLastName(String lastnametext) {
		checkoutLastname.sendKeys(lastnametext);
	}

	public void enterEmail(String emailtext) {
		checkoutEmail.sendKeys(emailtext);
	}

	public void enterTelephone(String telephonetext) {
		checkoutTelephone.sendKeys(telephonetext);
	}

	

	public void enterAddress1(String address1text) {
		address1TextBox.sendKeys(address1text);
	}	
	public void enterAddress2(String address2text) {
		address2TextBox.sendKeys(address2text);
	}	
	public void enterCity(String cityText) {
		cityTextBox.sendKeys(cityText);
	}	
	public void enterPostCode(String postCodeText) {
		postcodeTextBox.sendKeys(postCodeText);
	}	
	public WebElement enterCountry() {
		WebElement countryNames= countryTextBox;
			return countryNames;
			
		}	
		public WebElement enterZone() {
		WebElement zoneNames= zoneTextBox;
			return zoneNames;	
		}	


	public void clickOnContinueAsGuest() {
		continueAsGuest.click();
		
	}
	
	public void clickOnContinueDeliveryMethodAsGuest() {
		continueDeliverymethodAsGuest.click();
	}
	
	
	public String getStatusofPaymentMethodText() {
		String displayPaymentMethodStatus= getStatusofPaymentmethod.getText();
		return displayPaymentMethodStatus;}
		
	public void clickOnpreferedPaymentMethod() {
		paymentMethod.click();
	}

	public void clickOnpaymentMethodTandCAgree() {

		paymentMethodTandCAgree.click();
	}
	public void clickOnPaymentMethodContinue() {
		paymentMethodContinue.click();
		
	}
	public String getStatusofConfirmOrderText() {
		String ConfirmOrderStatus= Confirmorderstatus.getText();
		return ConfirmOrderStatus;}

	public boolean getStatusofOrderInfoDisplayed() {
		boolean displayOrderInfoStatus= statusOfOrderInfo.isDisplayed();
		return displayOrderInfoStatus;}

	public String VerifyingCorrect_Product_being_purchased() {
		
		String correctproduct= correctProduct.getText();
	    return correctproduct;
	}
	public void enterBasicDetails() {
			checkoutFirstname.sendKeys("Mashrufa");
		
			checkoutLastname.sendKeys("Shanjia");
		
			checkoutEmail.sendKeys("sajidamoin@yahoo.com");
		
	     	checkoutTelephone.sendKeys("57489655542");
		
	     	address1TextBox.sendKeys("4452 EDAN CT");
	    	
			address2TextBox.sendKeys("APT 100");
		
		
			cityTextBox.sendKeys("Annandale");
		
			postcodeTextBox.sendKeys("22003");	}
	
	public void navigateToOrderInfoSection() {
	
		continueAsGuest.click();	

		continueDeliverymethodAsGuest.click();

		paymentMethodTandCAgree.click();

		paymentMethodContinue.click();
			
		}
		
	}

	
	



