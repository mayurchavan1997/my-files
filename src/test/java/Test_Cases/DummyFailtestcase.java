package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.loginPage;
import com.Utility.baseClass;

public class DummyFailtestcase extends baseClass{
	
	@Test
	public void verify_login() throws IOException {
		
	loginPage log=PageFactory.initElements(driver, loginPage.class); 
		
	boolean res=log.logo().isDisplayed();
	
	Assert.assertEquals(res, true); // intentionally failing test case to take screen shot
	// agar na fail krna ho is false ko true  liko

}}
