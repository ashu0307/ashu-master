package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave 
{
	public WebDriver driver;
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings']")
	private WebElement SettingButton;
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement LeaveTypeButton;
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement CreateLeaveTypeButton;
	@FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
	private WebElement LeaveNameTextField;
	@FindBy(xpath="(//a[@class=\'x-menu-item\'])[1]")
	private WebElement StatusActiveButton;
	@FindBy(xpath="(//a[@class=\"x-menu-item\"])[2]")
	private WebElement StatusArchieveButton;
	@FindBy(id="leaveTypeLightBox_rateCoefficient")
	private WebElement LeaveHourRateInputBox;
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
	private WebElement CreateLeaveTypeSubmitButton;
	@FindBy(xpath="//div[@id='leaveTypeLightBox_cancelBtn']")
	private WebElement CancelButton;

	
	public Leave(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
  
public void createLeaveType()
{
	SettingButton.click();
	LeaveTypeButton.click();
	CreateLeaveTypeButton.click();
	LeaveNameTextField.sendKeys("Casual Leaves");

	LeaveHourRateInputBox.sendKeys("2");
//	CreateLeaveTypeSubmitButton.click();4
}

public void CancelLeaveMethod()
{
	CancelButton.click();
	Alert alt= driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
}

public void clickMethod(RemoteWebDriver driver, By locator )
{
	driver.findElement(locator).click();
}
}
