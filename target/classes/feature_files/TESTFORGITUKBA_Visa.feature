@TestToRun
Feature: Confirm whether visa is reuired to visit UK
#  As a Tourist/Student
#  I want to know if I require Visa to come to the UK from my country.
#  So that I can make a decision before I travel

  Background:
  Given I am on the UKBA website
@Regression
  @smoke
  Scenario: Japan nationalities coming to UK to study for more than 6 months require Visa
    When I provide nationality of "Japan"
    And I click on the Continue button
    And I select the reason "Study"
    And I click on the Continue button
    And I state I am intending to stay for more than 6 months
    And I click on the Continue button
    Then I will be informed "You’ll need a visa to study in the UK"
@scen2
  Scenario: Japan nationalities coming to UK for Tourism do not require Visa
  When I provide nationality of "Japan"
  And I click on the Continue button
    And I select "tourism" as reason for coming to the UK
    And I click on the Continue button
  Then I will be informed "You will not need a visa to come to the UK"
  @scen3
  Scenario Outline: Nationalities coming to UK to study for more than 6 months require Visa using Scenario outline
    When I provide nationality of "<CountryName>"
    And I click on the Continue button
    And I select the reason "Study"
    And I click on the Continue button
    And I state I am intending to stay for more than 6 months
    And I click on the Continue button
    Then I will be informed "You’ll need a visa to study in the UK"
    @UAT
    Examples:
    |CountryName|
    |Japan      |
    |Ukraine|
    |Morocco|
#    |USA|
#    |Australia|
#    |Canada   |
    @Dev
    Examples:
      |CountryName|
      |USA|
      |Australia|
      |Canada   |

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



