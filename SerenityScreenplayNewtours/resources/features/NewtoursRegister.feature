#Author: your.email@your.domain.com
Feature: Register on Newtours page (http://www.newtours.demoaut.com/)
  As a web user
  I want to register on newtours page
  To be able to log in on the page

  Background: 
    Given that Lory navigate to the register form of Newtours

  @RegisterWithAllData
  Scenario: Register with all the data
    When she put the data in the correct order
      | firstName | lastName | phone | email          | address1 | city    | state | postalCode | country | userName       | password | cPass  |
      | pepito    | perez    | 12345 | pepito@abc.com |   123456 | KAMPALA |       |     123456 | UGANDA  | pepito@abc.com |   123456 | 123456 |
     And she clicks the submit button
    Then she should see the confirmation page

  @RegisterWithoutUsername
  Scenario: Register without username and password
    When she put the data in the correct order
      | firstName | lastName | phone | email | address1 | city    | state | postalCode | country | userName | password | cPass |
      | pepito    | perez    | 12345 |       |   123456 | KAMPALA |       |     123456 | UGANDA  |          |          |       |
     And she clicks the submit button
    Then she should see the confirmation page
