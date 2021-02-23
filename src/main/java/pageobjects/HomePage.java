package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import managers.FileReaderManager;


public class HomePage {
	WebDriver driver;
	String baseUrl;
	
	@FindBy(id="searchDropdownBox")
	private WebElement staticDropCat;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(css="#nav-search-submit-button")
	private WebElement searchButton;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void selectProductCategory(String category) {
		Select dropdown = new Select(staticDropCat);
		dropdown.selectByVisibleText(category);
	}
	public void enterProduct(String product){
		searchBox.sendKeys(product);
	}
	
	public void clickOnSearchButton(){
		searchButton.click();
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
	
