package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;

public class LoginPage extends BaseClass {
	// the other way using page factory
//@findBy is a technique or approach to locate elements
	//locating WebElement using
	
	@FindBy(id="txtUsername")
	public WebElement name;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	public WebElement login;
	

	@FindBy(xpath="//div[@id='divLogo]")
	public WebElement logo;
	
	LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void login(String Username, String UserPassword) {
		CommonMethods.sendText(name,Username );
		CommonMethods.sendText(password, UserPassword);
		CommonMethods.click(login);
	}
	
	
	
}
		
		
		
		
		
		
		
		
		
		

