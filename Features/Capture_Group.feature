Feature: Verify after successful login User Balance is displayed

This Feature file implements the concept of Capture group where URL will be part of capture group


Scenario: Validate Successful Login on the application
This Scenario demonstrate use of Capture group
	Given User navigates to http://parabank.parasoft.com
	When  User enter login name 
	And   User enter password
	Then User is able to login
