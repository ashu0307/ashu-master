package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@id='username']")
private WebElement usernameTextField;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextField;
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement LoginButton;
	@FindBy(xpath="//div[.='Keep me logged in']")
	private WebElement KeepmeLoggedinCheckBox;
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTimeIncLink;
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement Forgotpasswordlink;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void LoginMethod()
	{
		usernameTextField.sendKeys("admin");
		passwordTextField.sendKeys("manager");
		KeepmeLoggedinCheckBox.click();
		LoginButton.click();
		
	}
		public void forgotpasswordMethod()
		{
			Forgotpasswordlink.click();
		}
		
		public void clickMethod(RemoteWebDriver driver, By locator )
		{
			driver.findElement(locator).click();
		}
	}

	