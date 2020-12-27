package com.gw.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gw.util.TestBase;



public class LoginPage extends TestBase {
	// PageFactory - OR

		@FindBy(name = "Login:LoginScreen:LoginDV:username")
		WebElement username;

		@FindBy(name = "Login:LoginScreen:LoginDV:password")
		WebElement password;

		@FindBy(xpath = "//span[contains(text(),'Log In')]")
		WebElement login;
		
		@FindBy(xpath = "//span[@id = ':TabLinkMenuButton-btnIconEl']")
		WebElement settings;
		
		@FindBy(xpath = "//span[contains(text(),'Log Out Super User')]")
		WebElement logoutButton;

		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		// Actions
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}


		public HomePage login(String usn, String pwd) {
			username.sendKeys(usn);
			password.sendKeys(pwd);
			login.click();

			return new HomePage();
		}
		public void logout() {
			settings.click();
			logoutButton.click();
		}

}

