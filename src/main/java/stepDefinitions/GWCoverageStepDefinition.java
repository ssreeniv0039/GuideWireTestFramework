package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.gw.pages.HomePage;
import com.gw.pages.LoginPage;
import com.gw.pages.PolicyPage;
import com.gw.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GWCoverageStepDefinition extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	PolicyPage policyPage;
	
	@Given("^User is alreadyon login page$")
	public void user_is_alreadyon_login_page() throws Throwable {
		initialization();
	}

	@When("^title of logon page is Guidewire PolicyCenter$")
	public void title_of_logon_page_is_Guidewire_PolicyCenter() throws Throwable {
	    loginPage  = new LoginPage();
	    String loginPage_title = loginPage.validateLoginPageTitle();
	    Assert.assertEquals("[DEV mode - 8.0.4.323] Guidewire PolicyCenter", loginPage_title);
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		homePage = loginPage.login(username, password);
	}

	@Then("^User is then directed to home page$")
	public void user_is_then_directed_to_home_page() throws Throwable {
		  String homePage_title = homePage.verifyHomePageTitle();
		  System.out.println(homePage_title);
	}

	@Then("^User enters the policy number in the search box$")
	public void user_enters_the_policy_number_in_the_search_box() throws Throwable {
		homePage = new HomePage();
		Thread.sleep(2000);
		homePage.search("Policy 7198590986");
	}

	@Then("^User is directed to the policy page and clicks on Coverages$")
	public void user_is_directed_to_the_policy_page_and_clicks_on_Coverages() throws Throwable {
		  policyPage = new PolicyPage();
		  Thread.sleep(2000);
		  policyPage.clickOnCoverages();
	}
	@Then("^User selects the optional property coverages$")
	public void user_selects_the_optional_property_coverages() throws Throwable {
		Thread.sleep(2000);
	   policyPage.clickonOPC();
	}

	@Then("^User verifies the Earthquake coverage$")
	public void user_verifies_the_Earthquake_coverage() throws Throwable {
	    String earthQuakeCov_label = driver.findElement(By.xpath("//div[contains(text(),'Earthquake Coverage')]")).getText();
	    System.out.println(earthQuakeCov_label);
	    Assert.assertEquals("Earthquake Coverage", earthQuakeCov_label);
	}

	@Then("^User clicks on Forms and validates the Earthquake coverage$")
	public void user_clicks_on_Forms_and_validates_the_Earthquake_coverage() throws Throwable {
		Thread.sleep(2000);
	  policyPage.clickOnForms();
	  String earthQuakeCov_label = driver.findElement(By.xpath("//div[contains(text(),'Earthquake Coverage')]")).getText();
	  System.out.println(earthQuakeCov_label);
	  Assert.assertEquals("Earthquake Coverage", earthQuakeCov_label);
	}
	

	@Then("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		Thread.sleep(2000);
	    loginPage.logout();
	}

	@Then("^User is directed to the Login Page$")
	public void user_is_directed_to_the_Login_Page() throws Throwable {
		String loginPage_title = loginPage.validateLoginPageTitle();
	    Assert.assertEquals("[DEV mode - 8.0.4.323] Guidewire PolicyCenter", loginPage_title);
	}

	@Then("^User quits the browser$")
	public void user_quits_the_browser() throws Throwable {
		driver.quit();
	}
	
}
