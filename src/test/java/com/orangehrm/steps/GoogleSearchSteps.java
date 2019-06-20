package com.orangehrm.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps extends BaseClass{
	
	
	@Given("I navigated to the Google")
	public void i_navigated_to_the_Google() {
		
		
	}

	@When("I type search item")
	public void i_type_search_item() {
	   WebElement searchElement = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	   CommonMethods.sendText(searchElement, "Liza");
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
   WebElement searchBttn = driver.findElement(By.xpath("//div[@class='VlcLAe']//center//input[1]"));
   CommonMethods.click(searchBttn);
   
	}

	@Then("I see search results are displayed")
	public void i_see_search_results_are_displayed() {
	 boolean isDisplayedResultElement = driver.findElement(By.xpath("//div[@id='resultStats']")).isDisplayed();
	 if (isDisplayedResultElement==true){
		 System.out.println("Results are Displayed");
		 
	 }
	 tearDown();
	}
}
