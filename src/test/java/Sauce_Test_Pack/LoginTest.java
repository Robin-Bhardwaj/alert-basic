package Sauce_Test_Pack;

import org.testng.Assert;
import org.testng.annotations.Test;

import Sauce_Base.Base;
import Sauce_Page_Pack.LoginPage;

public class LoginTest extends Base{
 public static LoginPage loginPage;

 @Test(priority=1)
 public void Ltest(){ 
		loginPage=new LoginPage(driver);
		String actualTest=loginPage.Head();
		String expectedTest="Swag Labs";
		Assert.assertEquals(expectedTest, actualTest);
		
		loginPage.UN("standard_user");
		loginPage.PW("secret_sauce");
		loginPage.LButton();

	}

}
