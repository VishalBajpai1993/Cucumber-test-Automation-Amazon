package stepdefinition;

import org.openqa.selenium.WebDriver;
import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.AddToCartPage;
import pageobjects.CheckOutPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;


public class Steps {
	
	static WebDriver driver;
	TestContext testContext;
	HomePage homePage;
	ProductsPage productsPage;
	AddToCartPage addToCartPage;
	CheckOutPage checkOutPage;
	LoginPage loginPage;

	public Steps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		productsPage = testContext.getPageObjectManager().getProductListingPage();
		addToCartPage = testContext.getPageObjectManager().getAddToCartPage();
		checkOutPage = testContext.getPageObjectManager().getCheckoutPage();
		loginPage = testContext.getPageObjectManager().getLoginPage();
		
	}
	
	@Given("^user is on Home Page$")
	public void userIsOnHomePage(){
		homePage.navigateTo_HomePage();
	}
 
	@When("^he search for \"(.*)\" under category \"(.*)\"$")
	public void heSearchForUnderCategory(String product, String category)  {
		homePage.selectProductCategory(category);
		homePage.enterProduct(product);
		homePage.clickOnSearchButton();
	}
 
	@When("^choose to buy the first item$")
	public void chooseToBuyTheFirstItem() {		
	}
	
	@When("^Add product to shopping cart$")
	public void addsProductToShoppingCart(){
		addToCartPage.addTocart();
	}
 
	@When("^User clicks on shopping cart$")
	public void userClicksOnShoppingCart(){
		checkOutPage.clickSoppingCart();	
	}
	
	@When("^Cliks on proceed to check out$")
	public void userClicksOnProceedCheckOut(){
		checkOutPage.clicksOnProceedCheckPOut();	
	}
	
	@Then("^User should be asked to login before checkout$")
	public void enterPersonalDetailsOnLoginPage() throws InterruptedException {
		homePage.closeBrowser();
	}
	
    @And("^Log in with user credentials$")
    public void log_in_with_user_credentials() {
    	loginPage.loginAsGivenUser();
    }
    
    @When("^Apply multiple filters$")
    public void apply_multiple_filters() {
    	//productsPage.PrimeFilter();
    	productsPage.ReviewRefine();
    	productsPage.SelectBrand();
    }
}
