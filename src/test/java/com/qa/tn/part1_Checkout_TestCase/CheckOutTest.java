package com.qa.tn.part1_Checkout_TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tn.part1_Checkoutpages.AddtoCartPage;
import com.qa.tn.part1_Checkoutpages.CheckOutPage;
import com.qa.tn.part1_Checkoutpages.CheckOut_GuestPage;
import com.qa.tn.part1_Checkoutpages.HomePage;
import com.qa.tn.part1_Checkoutpages.ProductInfoPage;
import com.qa.tn.part1_Checkoutpages.SearchProductPage;
import com.tn.qa.testBase.TestBase;


public class CheckOutTest extends TestBase {

	public CheckOutTest() throws Exception {
		super();		
	}

	public WebDriver driver;
    public HomePage homepage;
    SearchProductPage searchproductpage;
    ProductInfoPage  productinfopage;
    CheckOutPage checkoutpage;
     CheckOut_GuestPage checkoutasguestpage;
 
    
	@BeforeMethod
	public void setup() throws Exception {
		driver=initalizeBrowserAndOpenApplication();
		homepage= new HomePage(driver);
		homepage.enterProductDetail();
		Thread.sleep(1000);
		searchproductpage= homepage.clickOnSearchIcon();
		Assert.assertTrue(searchproductpage.verifyDisplayStatusOfValidProduct());
		productinfopage= searchproductpage.clickOnAddtoCart(); 
		productinfopage.clickOnAddtoCartinProductInfopage();
		Thread.sleep(2000);
		AddtoCartPage addtocartpage = new AddtoCartPage(driver);
		Assert.assertTrue(addtocartpage.varifyMessageofProductAddedDisplayed());
		Thread.sleep(2000);
		addtocartpage.clickOnAddForCheckout();
		addtocartpage.clickOnCheckout();
		
	}
		
	
	@Test( )
	public void checkOutAsGuestUser() throws Exception {
		checkoutpage= new CheckOutPage(driver);
		checkoutpage.clickOnGuestUserforCheckout();
		checkoutpage.clickOnContinueRegisterButton();
		CheckOut_GuestPage checkoutguestpage = new CheckOut_GuestPage(driver);
		checkoutguestpage.enterBasicDetails();
		 Select select = new Select(checkoutguestpage.enterCountry());
		 select.selectByVisibleText("United States");
		 Select select1 = new Select(checkoutguestpage.enterZone());
		 select1.selectByVisibleText("Virginia");
		checkoutguestpage.navigateToOrderInfoSection();
		Assert.assertTrue(checkoutguestpage.getStatusofOrderInfoDisplayed());
		String ActualMessage=checkoutguestpage.VerifyingCorrect_Product_being_purchased();
		String ExpectedMessage= "HP LP3065";
		Assert.assertTrue(ActualMessage.contains(ExpectedMessage));
		
			
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}