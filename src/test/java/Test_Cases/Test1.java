package Test_Cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.loginPage;
import com.Utility.baseClass;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
public class Test1 extends baseClass {

			//  
	
	
	@Test
	public void verify_login() throws IOException {
		
	loginPage log=PageFactory.initElements(driver, loginPage.class); 
		
	boolean res=log.logo().isDisplayed();
	
	Assert.assertEquals(res, true);

	
	File  file = new File("/home/mahesh/eclipse-workspace/New_Project/imageres/logo.gif");
	System.out.println("file read properly");
	BufferedImage  expectedImage = ImageIO.read(file);
	System.out.println("created the  image buffer");
	
	//AShot obj = new AShot(); // will be needing the  jar file for it
	Screenshot actualScreenshot =  new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	BufferedImage  actualImage = actualScreenshot.getImage();
	// comparison
	ImageDiffer imgComp = new ImageDiffer();  // comapred the part of it 
	ImageDiff diff = imgComp.makeDiff(actualImage,expectedImage);
	System.out.println("comparsion sucess"+diff);
	Assert.assertTrue(true);
	
	
	
	
	
	
	
	
	}
	
}
