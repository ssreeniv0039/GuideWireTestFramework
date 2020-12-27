Feature: PolicyChange in Homeowners Dwelling

Scenario Outline: Verify policy change Homeowners Dwelling Limit

Given User is alreadyon login page
When title of logon page is Guidewire PolicyCenter
Then User enters "<username>" and "<password>"
And User is then directed to home page
Then User enters the policy number in the search box
And User is directed to the policy page and clicks on Coverages
Then User verifies the homeowners dwelling limit against the expected result 
Then User clicks on summary and verifies the pending policy transcations
And User clicks on transaction number
Then User clicks on the policy center contract coverages 
Then User validates the homeowners dwelling limit policy change against the expected results
Then User LogOut from the Application
And User is directed to the Login Page
Then User quits the browser

Examples:
	| username | password |
	| su			  |	gw			|