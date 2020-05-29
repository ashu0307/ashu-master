package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Customer;
import Pages.Leave;
import Pages.LoginPage;
import Pages.TypeofWork;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/BMW Automation/NCSA6/exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage Login = new LoginPage(driver);
		Login.LoginMethod();
	
//		TypeofWork Work = new TypeofWork(driver);
//				Work.TypeofworkMethod();
//				
				Leave leaves= new Leave(driver);
				leaves.createLeaveType();
				leaves.CancelLeaveMethod();
				
//				Customer Custom = new Customer(driver);
//						Custom.createcustomerMethod();
//						Custom.cancelCustomerMethod();
	}
	
	

}
