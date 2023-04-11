package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {

	@FindBy(how=How.XPATH, using="//input[@name='uid']")
	private WebElement uid;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']") 
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@name='btnLogin']") 
	private WebElement btn;
	
	
	
	@FindBy(how=How.XPATH,using="(//a[@class='level0 '])[1]")
	private WebElement mobile;
	
	@FindBy(how=How.XPATH,using="//img[@class='large']")
	private WebElement logo_1;
	
	
	@FindBy(how=How.XPATH,using="(//select[@title='Sort By'])[1]")
	private WebElement drp_dn;
	
public WebElement get_uid() {
	return uid;
}
public WebElement get_password() {
	return password;
}
	
public WebElement get_btn() {
	return btn;
}
public WebElement mob() {
	return mobile;
}
public WebElement logo() {
	return logo_1;
}
public WebElement drp_() {
	return drp_dn;
}
}
