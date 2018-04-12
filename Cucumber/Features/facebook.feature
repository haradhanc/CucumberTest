@facebook1
Feature: Facebook functionality

Background:
Given Open browser and start application.

  Scenario: Test login functionality
  When I enter username as "deb@gmail.com" and password "deb@123"
  And I click on Login button
  Then user should be see the home page
  #And I close the browser
  
  
  
  