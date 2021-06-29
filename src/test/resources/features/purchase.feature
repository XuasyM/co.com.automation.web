#Author: XuasyMeneses

@purchase
Feature: Purchase operations

  @buyLowerPriced @regression
  Scenario Outline: Buy the lowest priced product
    Given log in with an active user  <username> <password>
    When select the lowest priced product
    And carry out the purchase process <firstName> <lastName> <zipCode>
    And confirm purchase
    Then verify successful purchase <message>

    Examples:
      |username|password|firstName|lastName|zipCode|message|
      |"standard_user"|"secret_sauce"|"Test"|"User"|"12345"|"CHECKOUT: COMPLETE!"|