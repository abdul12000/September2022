Feature: newtours
#  As a User, I want to be able to enter only accepted User Information details so that I can Register an account on the Mercury tours site
#  https://demo.guru99.com/test/newtours/
#@Newt
  Scenario:Flight Finder page
    Given I am on the Newtours Home page
    When I click on the Flights link on the left side menu
    Then The Flight Finder Page should be displayed
    And “One Way” Flight details type is selected by default
    And “January 1” should be displayed by default for On and returning
    And “Economy Class” should be selected as default for the Service class

  @Newt
  Scenario Outline: Register by entering only User Information
    Given I am on the Newtours Home page
    When I click on the Register link
    And I enter "<Username>", password and confirm as "<Password>"
    And enter "<CountryName>"
    And I click submit button
    Then confirmation page is displayed with my "<Username>"

    Examples:
      | Username | Password      | CountryName    |
      | Jose     | password120   | ANGOLA         |
      | Late     | password2200  | ALBANIA        |
      | Pause    | 2929swo983920 | UNITED KINGDOM |
      | Andy     | WORDword120   | HAITI          |

@Testing
  Scenario:Flight Finder page
    Given I am on the Newtours Home pageo
    When I click on the Flights link on the left side menuo
    Then The Flight Finder Page should be displayedo
    And “One Way” Flight details type is selected by defaulto
    And “January 1” should be displayed by default for On and returningo
    And “Economy Class” should be selected as default for the Service class