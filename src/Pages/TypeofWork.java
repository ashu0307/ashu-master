package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypeofWork 
{
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings']")
private WebElement SettingButton;
	@FindBy(xpath="//a[contains(text(),'Types of Work')]")
	private WebElement TypeofWorkButton;
	@FindBy(xpath="//div[@id='ext-comp-1002']")
	private WebElement CreateTypeofWorkButton;
	@FindBy(id="name")
	private WebElement NameTextField;
	@FindBy(xpath="//select[@name='active']")
	private WebElement	StatusDropdown;
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement BillableRadiobutton;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement NonBillableRadioButton; 
	@FindBy(xpath="//input[@onclick='handleCancel();']")
	private WebElement CancelButton;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement SubmitButton;
	
	public TypeofWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void TypeofworkMethod() throws InterruptedException
	{
		SettingButton.click();
		Thread.sleep(4000);
		TypeofWorkButton.click();
		CreateTypeofWorkButton.click();
		NameTextField.sendKeys("Automation");
		SubmitButton.click();
	}
}
	