package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ShoppingCartPage;

public class OrderStepDef {
	
	WebDriver driver=TestBase.getDriver();
	HomePage homePage;
	SearchResultPage resultPage;
	ShoppingCartPage cartPage;
	CheckOutPage checkoutPage;
	
	
	public OrderStepDef()
	{
		homePage=new HomePage(driver);
		resultPage=new SearchResultPage(driver);
		cartPage=new ShoppingCartPage(driver);
		checkoutPage=new CheckOutPage(driver);
	}
	
	
	@When("User do checkout")
	public void user_do_checkout() {
		cartPage.doCheckout();
//	   checkoutPage.checkHeading();
	}
	@Then("Should navigate to Checkout page")
	public void should_navigate_to_checkout_page() {
	    checkoutPage.buyItems();
	}
	
	
	
	
	@Given("User should be on Search Result Page")
	public void user_should_be_on_search_result_page() {
	    resultPage.viewItemDetail();
	}
	@When("User add item to cart")
	public void user_add_item_to_cart() {
	    resultPage.addToCart();
	}
	@Then("Item must be added")
	public void item_must_be_added() {
	    Assert.assertTrue(cartPage.isItemAdded());
	}
	
	
	
	

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    TestBase.openUrl("http://danube-webshop.herokuapp.com/");
	}
	@When("User search an item {string}")
	public void user_search_an_item(String strItem) {
	    homePage.searchItem(strItem);
	}
	@Then("Item must be listed")
	public void item_must_be_listed() {
	    Assert.assertTrue(resultPage.isItemListed());
	}

}
