@GuideWireApplicationTest
Feature: PolicyCenter login feature

Scenario Outline:PolicyCenter login feature

Given User is alreadyon login page
When title of logon page is Guidewire PolicyCenter
Then User enters "<username>" and "<password>"
And User is then directed to home page
Then User LogOut from the Application
And User is directed to the Login Page
Then User quits the browser

Examples:
	| username | password |
	| su			  |	gw			|
	
Scenario Outline: Verify policy total charges

Given User is alreadyon login page
When title of logon page is Guidewire PolicyCenter
Then User enters "<username>" and "<password>"
And User is then directed to home page
Then User enters the policy number in the search box
And User is directed to the policy page and clicks on Billing
Then User verifies the total charges against the expected result
Then User LogOut from the Application
And User is directed to the Login Page
Then User quits the browser

Examples:
	| username | password |
	| su			  |	gw			|
	

