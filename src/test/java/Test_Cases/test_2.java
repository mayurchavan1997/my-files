package Test_Cases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Pages.loginPage;
import com.Utility.baseClass;

import net.bytebuddy.utility.RandomString;

public class test_2 extends baseClass {

				//  verify MObile list can be sorted by names
	
	
	@Test
	public void Verify_MObile_list_canbe_Sorted() throws Exception {
		
		loginPage login=PageFactory.initElements(driver, loginPage.class);

// Click on MObile Menu		
		login.mob().click();
		
		
// click on dropdown option	
		WebElement drp_dwn=driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
		Select sel=new Select(drp_dwn);
		sel.selectByVisibleText("Name");
		
		
// take screenshot to verify...		
		String path="/home/mahesh/eclipse-workspace/New_Project/ScreenShot//";
		String rm=RandomString.make(4);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dstn=new File(path+rm+".png");
		FileUtils.copyFile(src, dstn);
		
	}
}
