package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;


public class ProductsPage {
	
	WebDriver driver;
	
	@FindBy(css = "#primeRefinements input[type='checkbox']")
	private WebElement isPrimeSelect;
	@FindBy(css = "#reviewsRefinements [aria-label='4 Stars & Up']")
	private WebElement fourUp;
	@FindBy(css = "#reviewsRefinements [aria-label='3 Stars & Up']")
	private WebElement threeUp;
	@FindBy(css = "#reviewsRefinements [aria-label='2 Stars & Up']")
	private WebElement twoUp;
	@FindBy(css = "#reviewsRefinements [aria-label='1 Star & Up']")
	private WebElement oneUp;
	//@FindBy(css = "#brandsRefinements [aria-label='Dell'] input[type='checkbox']")
	//private WebElement brand;
	@FindBy(xpath = "//div[@id='brandsRefinements']//li[@aria-label='Dell']// i")
	private WebElement brand;
	
//	@FindBy(xpath = "//h2[@data-attribute='Head First Java, 2nd Edition']")
	//private WebElement headFirstJava;
	
//	@FindBy(xpath = "//h2[@data-attribute='Head First Python: A Brain-Friendly Guide']")
//	private WebElement headFirstPython;

	
	public ProductsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@SuppressWarnings("unused")
	public void PrimeFilter() {
		isPrimeSelect.click();
	}

	public void ReviewRefine() {
		switch(FileReaderManager.getInstance().getConfigReader().getReviewFilterInput()) {
		case "1up":
			oneUp.click();
			break;
		case "2up":
			twoUp.click();
			break;
		case "3up":
			threeUp.click();
			break;
		case "4up":
			fourUp.click();
			break;
		}
		
	}
	
	public void SelectBrand() {
		brand.click();
	}
	/*
	public void FilterApply() {
		//PrimeFilter();
		ReviewRefine();
		SelectBrand();
		
	}*/
}
