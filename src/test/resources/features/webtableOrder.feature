Feature: Web table user order feature
@wip
  Scenario: user should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When  user select product type "Familybea"
    And  user enters quantity 2
    And user enters costumer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters credit card type "Visa"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in the first row of the web table
