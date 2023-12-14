package automation.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	private WebDriver driver;

	public ClientPage(WebDriver _driver) {
		// super();
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	@FindBy(xpath = "//span[@class=\"menu-text \" and text()='Clients']")
	WebElement clientLinks;
	@FindBy(xpath = "//a[@data-title='Add client']")
	WebElement clientAddButton;

	@FindBy(id = "type_person")
	WebElement radioPersion;

	@FindBy(id = "company_name")
	WebElement textboxClientName;

//	@FindBy(id="select2-drop-mask")
//	WebElement ownerDropdownlist;
	@FindBy(id = "s2id_created_by")
	WebElement ownerDropdownlist;

	@FindBy(xpath = "")
	WebElement textboxOwner;

	// @FindBy(xpath = "//div[@id='select2-result-label-56']//div[text()='Sara
	// Ann']")
	@FindBy(xpath = "//ul[@id='select2-results-3']//div[text()='Sara Ann']")
	WebElement ownerItem;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement buttonSave;

	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clientsTab;

	@FindBy(xpath = "//input[@type='search' and @placeholder='Search']")
	WebElement textboxSearch;

	public void AddClientFuntion(String companyName, String owner) throws InterruptedException {
		clientLinks.click();
		clientAddButton.click();
		Thread.sleep(3000);
		radioPersion.click();
		textboxClientName.sendKeys(companyName);
		ownerDropdownlist.click();
		Thread.sleep(3000);
		ownerItem.click();
		buttonSave.click();
		//clientsTab.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clientsTab);
		Thread.sleep(3000);
		textboxSearch.sendKeys(companyName);
	}

//	public ClientPage(WebDriver driverCommonBase) {
//		
//		this.driver = driverCommonBase;
//		PageFactory.initElements(driverCommonBase, this);
//	}

}
