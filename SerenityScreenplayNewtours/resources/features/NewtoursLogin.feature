#Author: your.email@your.domain.com
Feature: Log in on Newtours page (http://www.newtours.demoaut.com/)
  As a web user
  I want to log in on newtours page
  To see the flight finder page

  Background: 
    Given that Max navigate to the login page of Newtours

  @UserLogin
  Scenario: Login with correct data
    When he enter Username and Password
      | userName     | password |
      | pepe@abc.com |    12345 |
     And he clicks login button
    Then he should see the flight finder page

  @UserLoginFail
  Scenario: Login with false data
     And he enter Username and Password
      | userName     | password |
      | fake@abc.com |    12345 |
     And he clicks login button
    Then he should see the flight finder page
