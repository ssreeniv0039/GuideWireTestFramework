package com.gw.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gw.util.TestBase;
import com.gw.util.TestUtil;

public class HomePage extends TestBase {
	//Page library
	// PageFactory - OR
	
	
	@FindBy(id = "QuickJump-inputEl")
	WebElement globalSearch;
	
	
	//Initialize Page factory
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public void search(String text) {
		globalSearch.sendKeys(text);
		globalSearch.sendKeys(Keys.ENTER);
	}
	
	
	
	

}

