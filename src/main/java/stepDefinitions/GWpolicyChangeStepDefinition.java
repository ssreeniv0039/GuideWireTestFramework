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

public class GWpolicyChangeStepDefinition extends TestBase{
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
		homePage.search("Policy 8941893330");
	}

	@Then("^User is directed to the policy page and clicks on Coverages$")
	public void user_is_directed_to_the_policy_page_and_clicks_on_Coverages() throws Throwable {
		  policyPage = new PolicyPage();
		  Thread.sleep(2000);
		  policyPage.clickOnCoverages();
	}

	@Then("^User verifies the homeowners dwelling limit against the expected result$")
	public void user_verifies_the_homeowners_dwelling_limit_against_the_expected_result() throws Throwable {
		String label = driver.findElement(By.xpath("//td[@id = 'PolicyFileHomeownersCoveragesHOE:PolicyFile_HomeownersCoveragesScreen:"
				+ "HOMainCoveragesHOEPanelSet:coveragePatterIterId1:1:HOCoverageInputSet:"
				+ "CovPatternInputGroup:0:CovTermPOCHOEInputSet:DirectTermInput-labelCell']")).getText();
		System.out.println(label);
		String oldLimit = driver.findElement(By.xpath("//div[@id = 'PolicyFileHomeownersCoveragesHOE:PolicyFile_HomeownersCoveragesScreen:"
				+ "HOMainCoveragesHOEPanelSet:coveragePatterIterId1:1:HOCoverageInputSet:"
				+ "CovPatternInputGroup:0:CovTermPOCHOEInputSet:DirectTermInput-inputEl']")).getText();
		System.out.println(oldLimit);
		System.out.println("Homeowners dwelling Limit before ploicy change :" +oldLimit);
		Thread.sleep(2000);
		Assert.assertEquals(oldLimit, "100,000");
	}

	@Then("^User clicks on summary and verifies the pending policy transcations$")
	public void user_clicks_on_summary_and_verifies_the_pending_policy_transcations() throws Throwable {
	 policyPage.clickOnSummary();
	 Actions action = new Actions(driver);
	 Thread.sleep(2000);
	WebElement transactionNum = driver.findElement(By.xpath("//span[contains(text(),'Transaction #')]"));
	action.moveToElement(transactionNum).build().perform();
	}

	@Then("^User clicks on transaction number$")
	public void user_clicks_on_transaction_number() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'0000225745')]")).click();
	}

	@Then("^User clicks on the policy center contract coverages$")
	public void user_clicks_on_the_policy_center_contract_coverages() throws Throwable {
		Thread.sleep(1000);
		policyPage.clickOnCoverages();
	}

	@Then("^User validates the homeowners dwelling limit policy change against the expected results$")
	public void user_validates_the_homeowners_dwelling_limit_policy_change_against_the_expected_results() throws Throwable {
		String label1 = driver.findElement(By.xpath("//td[@id = 'PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:HOMainCoveragesHOEPanelSet:"
				+ "coveragePatterIterId1:1:HOCoverageInputSet:CovPatternInputGroup:0:"
				+ "CovTermPOCHOEInputSet:DirectTermInput-labelCell']")).getText();
		System.out.println(label1);
		String newLimit = driver.findElement(By.xpath("//input[@id = 'PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:HOCoveragesHOEScreen:"
				+ "HOMainCoveragesHOEPanelSet:coveragePatterIterId1:1:HOCoverageInputSet:CovPatternInputGroup:0:"
				+ "CovTermPOCHOEInputSet:DirectTermInput-inputEl']")).getAttribute("value");
		System.out.println(newLimit);
		System.out.println("Homeowners dwelling Limit after ploicy change :" +newLimit);
		Assert.assertEquals(newLimit, "200,000");
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
