Feature: Implement Hooks  in the Stepdefinitions
This feature implements the concept of Hooks '@Before' and '@After'

Scenario: Validate whether Hooks are working as per expected

	Given User navigates to saucedemo page
	When User Login with valid login details
	Then User add a product to cart
	And User Logout
	