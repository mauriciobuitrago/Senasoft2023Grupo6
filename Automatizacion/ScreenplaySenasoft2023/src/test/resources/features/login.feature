Feature: Logging

  Scenario: Successful Logging
    Given that the user is on the web page
    When the user enters the credentials
    Then the user will be logged in


  Scenario: Empty fields
    Given that the user is on the website
    When the user does not enter the two credentials
    Then the user will not be logged in
