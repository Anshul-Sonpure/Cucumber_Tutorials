Feature: Register User feature
This Feature implements the concept of DataTables where the below data will be used to register the User.


Scenario: Validate user is able to register account on parabank
		Given User navigates to parabank website
		When User click on Register link
		Then User enters all the details
		|First Name | test					|
		|Last Name 	| user					|
		|Address 		| testaddr			|
		|City 			| testcity			|
		|State 			| teststate			|
		|Zip Code 	| 1234					|
		|Phone 			| 1234567890		|
		|SSN 				| 23421					|
		|Username 	| testuser3			|
		|Password 	| testuser@123	|
		|Confirm 		| testuser@123	|
		
		
		And User clicks on Register
		Then User is taken to User Home page
		
		
		