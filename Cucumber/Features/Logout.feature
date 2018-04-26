@facebook1
Feature: Facebook logout functionality
Background:
Given Open browser and start application.

  Scenario: Test login functionality
  When I enter username as "deb_saheb8@yahoo.co.in" and password "debashish@123"
  And I click on Login button
  Then user should be see the home page
  When I click on logout button
  #Then application should get logout automatically
  And I close the browser
