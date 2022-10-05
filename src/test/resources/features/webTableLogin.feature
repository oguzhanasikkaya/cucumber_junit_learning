Feature: User should be able to using correct credentials

  Background: user isss on the login page
    Given user is on the login page of web table app

  Scenario: Positive Login scenario
    #Given user is on the login page of web table app
    When  user enters username "Test"
    And   user enter password "Tester"
    And   user click to login button
    Then  user should see url contains orders

  Scenario: Positive Login scenario
   # Given user is on the login page of web table app
    When  user enters username "Test" password "Tester" and logins
    Then  user should see url contains orders
    #1 implement this new step
    #2 create login method in WebTableLoginPage
    #3 this login method should hava multiple different overloaded version


  Scenario: User should be able to see all 12 months in months dropdown
   # Given user is on the login page of web table app
    When  user enters below credentials
      | username | Test   |
      | password | Tester |
    Then user should see url contains orders


