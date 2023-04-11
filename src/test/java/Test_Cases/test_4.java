package Test_Cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.loginPage;
import com.Utility.baseClass;

public class test_4 extends baseClass {

					//  Verify total number of product display on the page "using findelements with tagname"

	@Test
	public void Verify_ListOfElements() {
		
		loginPage login=PageFactory.initElements(driver, loginPage.class);

		// Click on MObile Menu		
				login.mob().click();
				
				
		// click on dropdown option	
				WebElement drp_dwn=driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
				Select sel=new Select(drp_dwn);
				sel.selectByVisibleText("Name");
					
		
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='category-products']//img"));
		products.size();
	    System.out.println(products.size());
	    Assert.assertEquals(3, products.size());

	}		
}
