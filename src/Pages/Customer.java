package Pages;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Customer
{

	public WebDriver driver;
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement TaskButton;
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement CreateNewCustomerButton;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement CustomerNameTextField;
	@FindBy(xpath="//tr[@class=\\\"selectCustomerRow\\\"]//div[@class=\\\"comboboxButton\\\"]")
	private WebElement SelectCustomerDropdown;
	@FindBy(xpath="(//div[@class='searchItemList'])[1]/div[.='Big Bang Company']")
	private WebElement SelectBigBangDropDown;
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomerSubmitButton;
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement CancelButton;
	
	public Customer(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
public void createcustomerMethod() throws InterruptedException
{
	TaskButton.click();
	AddNewButton.click();
	Thread.sleep(2000);
	CreateNewCustomerButton.click();
	CustomerNameTextField.sendKeys("Automation");
//	CreateCustomerSubmitButton.click();
}

public void cancelCustomerMethod()
{
	CancelButton.click();
	Alert alt = driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
}

public void clickMethod(RemoteWebDriver driver, By locator )
{
	driver.findElement(locator).click();
}
}
