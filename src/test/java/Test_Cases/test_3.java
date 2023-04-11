package Test_Cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.loginPage;
import com.Utility.baseClass;

public class test_3 extends baseClass {

						// verify the text present on the element

	
	@Test
	public void Verify_UI() {
		
		loginPage log=PageFactory.initElements(driver, loginPage.class); 
		String mob=log.mob().getText();
		System.out.println(mob);
		Assert.assertEquals(mob, "MOBILE");
		
	}
	
	
}
