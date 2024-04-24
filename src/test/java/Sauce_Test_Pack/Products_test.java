package Sauce_Test_Pack;

import org.testng.annotations.Test;

import Sauce_Base.Base;
import Sauce_Page_Pack.ProductsPage;


public class Products_test extends Base {
	public static ProductsPage products;
	
	@Test(priority=2)
	public void productsTest() {
		products=new ProductsPage(driver);
		products.handleAlert();
	}
	
}
