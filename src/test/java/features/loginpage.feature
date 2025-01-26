Feature: Test login functionality

  Scenario: Validate user can log in
    Given Browser is open
    And User navigates to login page
    When User enters correct username and password
    And User clicks on login button
    Then User is navigated to the homepage