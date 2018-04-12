@facebook
Feature: Facebook friend request functionality
Background:
Given Open browser and start application.

  Scenario: Test login functionality
  When I enter username as "deb@gmail.com" and password "deb@123"
  And I click on Login button
  Then user should be see the home page
  When I click on friend request button
  And I delete friend request
  #Then application should get logout automatically
  #And I close the browser
