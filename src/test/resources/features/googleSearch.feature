Feature: Google search functionality
  Agile story: As a user, when I am the Google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    When user is ong Google search page
    Then user should see title is Google




  @wip
  Scenario: Search functionality result title verification
    Given user is ong Google search page
    When  user types "apple" and click enter
    Then  user sees "apple" in the google title