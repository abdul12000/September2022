Feature: NopcommerceFrontend
@Nop
  Scenario: nopcommerce frontend Add item to  shopping basket
    Given I am on the "https://demo.nopcommerce.com/" website
    When I navigate to Desktops screen
    And I choose "Build your own computer"
    And I click Add to cart button without choosing RAM size and HDD capacity
    Then error messages "Please select RAM" and "Please select HDD" are displayed
    When I choose 2 GB Ram and 320 GB HDD
    And I click Add to cart button
    Then "The product has been added to your " message is displayed