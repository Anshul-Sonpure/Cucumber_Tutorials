Feature: Login Successful via valid credentials
This feature will validate whether user is able to login to www.saucedemo.com application and implemented the concept of Background.

Background: 
				Given User navigates to SwagLabs page
				
				
Scenario: Validate Successful Login on the application
	
	When User enters valid login details
	Then User is able to login into application
	
Scenario: Validate User Login failure if Password is invalid
This Scenario demonstrate use of Capture group
		
		And User enters username standard_user and password secret_sauce123
		Then User is not able to login into application