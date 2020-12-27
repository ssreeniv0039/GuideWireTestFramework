//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//
//import com.gw.pages.HomePage;
//import com.gw.pages.LoginPage;
//import com.gw.pages.PolicyPage;
//import com.gw.util.TestBase;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class GWloginStepDefinition extends TestBase{
//	LoginPage loginPage;
//	HomePage homePage;
//	PolicyPage policyPage;
//	
//	@Given("^User is alreadyon login page$")
//	public void user_is_alreadyon_login_page() throws Throwable {
//		initialization();
//	}
//
//	@When("^title of logon page is Guidewire PolicyCenter$")
//	public void title_of_logon_page_is_Guidewire_PolicyCenter() throws Throwable {
//	    loginPage  = new LoginPage();
//	    String loginPage_title = loginPage.validateLoginPageTitle();
//	    Assert.assertEquals("[DEV mode - 8.0.4.323] Guidewire PolicyCenter", loginPage_title);
//	}
//
//	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String username, String password) throws Throwable {
//		homePage = loginPage.login(username, password);
//	}
//
//	@Then("^User is then directed to home page$")
//	public void user_is_then_directed_to_home_page() throws Throwable {
//	  String homePage_title = homePage.verifyHomePageTitle();
//	  System.out.println(homePage_title);
//	}
//	
//	@Then("^User enters the policy number in the search box$")
//	public void user_enters_the_policy_number_in_the_search_box() throws Throwable {
//		homePage = new HomePage();
//		homePage.search("Policy 7917294301");
//	}
//
//	@Then("^User is directed to the policy page and clicks on Billing$")
//	public void user_is_directed_to_the_policy_page_and_clicks_on_Billing() throws Throwable {
//	  policyPage = new PolicyPage();
//	  policyPage.clickOnBilling();
//	}
//
//	@Then("^User verifies the total charges against the expected result$")
//	public void user_verifies_the_total_charges_against_the_expected_result() throws Throwable {
//		String totalCharges = driver.findElement(By.xpath("//tr[@id = 'PolicyFile_Billing:Policy_BillingScreen:TotalCharges-inputRow']")).getText();
//		System.out.println(totalCharges);
//		String actualTotalCharges = driver.findElement(By.id("PolicyFile_Billing:Policy_BillingScreen:TotalCharges-inputEl")).getText();
//		System.out.println("Total charges is equal = " + actualTotalCharges);
//		Assert.assertEquals(actualTotalCharges, "$34,000.00");
//	}
//
//	@Then("^User LogOut from the Application$")
//	public void user_LogOut_from_the_Application() throws Throwable {
//		Thread.sleep(2000);
//	    loginPage.logout();
//	}
//
//	@Then("^User is directed to the Login Page$")
//	public void user_is_directed_to_the_Login_Page() throws Throwable {
//		String loginPage_title = loginPage.validateLoginPageTitle();
//	    Assert.assertEquals("[DEV mode - 8.0.4.323] Guidewire PolicyCenter", loginPage_title);
//	}
//	
//	@Then("^User quits the browser$")
//	public void user_quits_the_browser() throws Throwable {
//		driver.quit();
//	}
//
//}
