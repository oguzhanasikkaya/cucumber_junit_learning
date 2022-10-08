Feature: Web table user order feature

  Scenario: user should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When  user select product type "Familybea"
    And  user enters quantity 2
    And user enters costumer name "Oğuzhan Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters credit card type "Visa"
    And user enters credit card number "123456789123"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Oğuzhan Holmes" in the first row of the web table

  #--------------------------------------------------------------------------------------
  @wip
  Scenario Template: user should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When  user select product type "<productType>"
    And  user enters quantity <quantity>
    And user enters costumer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user enters credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in the first row of the web table

    Examples: Famous female scientists
      | productType | quantity | customerName      | street    | city   | state   | zipcode | cardType | cardNumber   | expDate | expectedName      |
      | MoneyCog    | 2        | Marie Curie      | London st | London | England | 253181  | Visa     | 123456654321 | 12/24   | Marie Curie       |
      | MoneyCog    | 2        | Lise Meitner      | London st | London | England | 253181  | Visa     | 123456654321 | 12/24   | Lise Meitner      |
      | MoneyCog    | 2        | Rosalind Franklin | London st | London | England | 253181  | Visa     | 123456654321 | 12/24   | Rosalind Franklin |

    Examples:
      | productType | quantity | customerName     | street    | city   | state   | zipcode | cardType | cardNumber   | expDate | expectedName |
      | Familybea   | 2        | Charles Darwin   | London st | London | England | 253181  | Visa     | 123456654321 | 12/24   | Charles Darwin  |
      | Familybea   | 2        | Albert Einshtein | London st | London | England | 253181  | Visa     | 123456654321 | 12/24   | Albert Einshtein |
      | Familybea   | 2        | C.V Raman        | London st | London | England | 253181  | Visa     | 123456654321 | 12/24   | C.V Raman   |