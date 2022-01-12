Feature: User is able to search for iphone 13 on amazon.in and verify the price

  Scenario Outline: Verify that user is able to search for iphone 13 on amazon.in
    Given User navigates to Google Home page 
    When User search for amazon webpage "<webpage>"
    Then User clicks on amazon link
    And User enters iphone in search "<product>"
    Then User is able to validate price of iphone13
    
    Examples: 
    |webpage | product   |
    |amazon	 | iphone13 |