#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: LoginOnNewtoursPage
  In this feature we will test login form of Newtours page (http://newtours.demoaut.com/)

  @LoginNewtours
  Scenario Outline: Uses true data on Newtours login form
    Given a user open the Newtours homepage
    When puts the Username as <userName> and Password as <password>
    And clicks on the Login button
    Then the user verify the <expected> page

    Examples: 
      | userName       | password | expected |
      | pepito@abc.com |    12345 | success  |

  @LoginNewtoursFail
  Scenario Outline: Uses false data on Newtours login form
    Given a user open the Newtours homepage
    When puts the Username as <userName> and Password as <password>
    And clicks on the Login button
    Then the user verify the <expected> page

    Examples: 
      | userName        | password | expected |
      | pepito@fake.com |    12345 | fail     |
