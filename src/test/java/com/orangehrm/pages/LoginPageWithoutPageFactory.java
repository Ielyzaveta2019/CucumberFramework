package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orangehrm.utils.BaseClass;

public class LoginPageWithoutPageFactory extends BaseClass {
	// one way using instance variables

	public WebElement username=driver.findElement(By.id("txtUsername"));
	 public WebElement password=driver.findElement(By.id("txtPassword"));
	 public WebElement btnLogin=driver.findElement(By.id("btnLogin"));

	

}
