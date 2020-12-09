package com.qa.ticker.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ticker.base.TestBase;


public class SearchPage extends TestBase {

	@FindBy(xpath = "//input[@id='txtSearchComp']")
	public WebElement Searchbar;

	@FindBy(xpath = "//span[@class='badge badge-primary']")
	public WebElement Search_result;

	@FindBy(xpath = "//span[@id='mainContent_ltrlOverAllRating']")
	public WebElement Finstar_Rating;

	@FindBy(xpath = "//div[@id='mainContent_ManagementRating']")
	public WebElement OwnerShip;
	
	@FindBy(xpath = "//div[@id='mainContent_ValuationRating']")
	public WebElement ValuationOfStock;

	@FindBy(xpath = "//div[@id='mainContent_EfficiencyRating']")
	public WebElement Efficiency;

	@FindBy(xpath = "//div[@id='mainContent_FinancialsRating']")
	public WebElement Finantials;
	
	
	@FindBy(xpath = "//span[@class='d-block h1 currprice']/span")
	public WebElement CurrentPrice;
	
	
	@FindBy(xpath = "//small[@class='text-center text-muted d-block']")
	public WebElement No_companyfound;
	
	
	@FindBy(xpath = "//h4[@id='mainContent_divAvgratingNH']")
	public WebElement Finstar_suspended;
	
	
	//======================Ganpati mandal===============================
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[1]")
	public WebElement Name;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[2]")
	public WebElement Mobile;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[3]")
	public WebElement Jillha;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[4]")
	public WebElement Pincode;

	@FindBy(xpath = "//span[text()='स्नेहनगर गणेश उत्सव मंडल']")
	public WebElement Mandal_name;
	
	@FindBy(xpath = "//span[@class='appsMaterialWizButtonPaperbuttonLabel quantumWizButtonPaperbuttonLabel exportLabel' and text()='Submit']")
	public WebElement Submit_button;
	
	@FindBy(xpath = "//div[text()='प्रतियोगीता मे सहभाग लेने के लिये हम आपके आभारी है। धन्यवाद !']")
	public WebElement Formresponse;
	
	
	//==================================================================
	//=============================intrinsic value =======================
	@FindBy(xpath = "//input[@type='text' and @placeholder='Search stocks...']")
	public WebElement SearchStock;
	
		
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	public SearchPage SearchForCompany(String CompanyName) {

		Searchbar.sendKeys(CompanyName);
		return new SearchPage();
	}

}
