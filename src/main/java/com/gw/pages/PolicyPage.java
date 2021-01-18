package com.gw.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gw.util.TestBase;

public class PolicyPage extends TestBase{
		//Page library
		// PageFactory - OR
		@FindBy(xpath = "//span[contains(text(),'Billing')]")
		WebElement billing;
		
		@FindBy(xpath = "//span[contains(text(),'Summary')]")
		WebElement summary;
		
		@FindBy(id = "QuickJump-inputEl")
		WebElement globalSearch;
		
		@FindBy(xpath = "//span[contains(text(),'Coverages')]")
		WebElement coverages;
		
		@FindBy(xpath = "//span[contains(text(),'Forms')]")
		WebElement forms;
		
		@FindBy(xpath = "//span[contains(text(),'Optional Property Coverages')]")
		WebElement OPC;
		
		
		
		//Initialize Page factory
		public PolicyPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public void clickOnBilling() {
			billing.click();
		}
		
		public void clickOnCoverages() {
			coverages.click();
		}
		
		public void clickOnSummary() {
			summary.click();
		}
		public void clickOnForms() {
			forms.click();
		}
		public void clickonOPC() {
			OPC.click();
		}
		
		
		
}
