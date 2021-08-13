#comment
@Smoketest
Feature: feature to test login

  

  Scenario Outline: Check login with valid values
    Given user is on login page
    When user enters <username> and <password>
    And clicks on Login button
    Then user navigating to landing page

    Examples: 
      | username | password |
      | user1    | pass2    |
      | user2    | pass1    |
      
