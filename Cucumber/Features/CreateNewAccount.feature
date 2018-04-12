@facebook
Feature: Facebook create account

Background:
Given Open browser and start application.

  Scenario: create account
  
  When I enter valid data on page
  |Fields Name|Value|
  |FirstName|De|
  |Surname  |Ch|
  |Mobile number|966|
  |New Password|deb|
  
  #And I close the browser
