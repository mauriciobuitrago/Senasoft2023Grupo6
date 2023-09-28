Feature: Login
  The user is on the website
  Scenario: On the Main in Page
    Given the user wants to log in
    When the user is on the main page
    Then the user click in the button for login

  Scenario: login failed
    Given the user wants to log in but fail
    When the user is on the main pages
    Then the user fail the  login
@LoginEmpy
  Scenario: login empty
    Given the user wants to log in but its empty
    When the user is in the mains pages
    Then the user dont put any dates





