package Sauce_Page_Pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Sauce_Base.Base;

public class ProductsPage extends Base {

	public void handleAlert() {
	Alert alerts=driver.switchTo().alert();
	alerts.accept();
	}
	
	
	// Initialize driver
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
