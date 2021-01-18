Feature: CoverageCheck in Homeowners Dwelling

Scenario Outline: Verify Earthquake Coverage Homeowners Dwelling Limit

Given User is alreadyon login page
Then title of logon page is Guidewire PolicyCenter
When User enters "<username>" and "<password>"
And User is then directed to home page
When User enters the policy number in the search box
Then User is directed to the policy page and clicks on Coverages
When User selects the optional property coverages
Then User verifies the Earthquake coverage
When User clicks on Forms and validates the Earthquake coverage
And User LogOut from the Application
Then User is directed to the Login Page
Then User quits the browser

Examples:
	| username | password |
	| su			  |	gw			|