Feature: User should be able to using correct credentials

  Scenario: Positive Login scenario
    Given user is on the login page of web table app
    When  user enters  "username"
    And   user enter "password"
    And   user click to login button
    Then  user should see url contains orders