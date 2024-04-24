package Sauce_Page_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sauce_Base.Base;

public class LoginPage extends Base { 
		
		//1) Get the heading
		
		@FindBy(xpath="//div[@class='login_logo']")
		WebElement logHeading;
		
		//2) Get the Username
		
		@FindBy(xpath="//input[@placeholder='Username']")
		WebElement logUser;
		
		//3) Get the Password
		
				@FindBy(xpath="//input[@placeholder='Password']")
				WebElement logPass;
				
		//4) Click on login button
				
				@FindBy(xpath="//input[@type='submit']")
				WebElement logButton; 

		// Initialize driver
				public LoginPage(WebDriver driver) {
					this.driver = driver;
					PageFactory.initElements(driver, this);
				}
				
		//1) Get the heading
		public String Head() {
			return logHeading.getText();
		}
		
		//2) Get the Username
		public void UN(String usName) {
			logUser.sendKeys(usName);
		}
		
		//3) Get the Password
		public void PW(String pWord) {
			logPass.sendKeys(pWord);
		}
		//4) Click on login button
		public void LButton() {
			logButton.click();
		}
}
