@facebook52
Feature: Facebook functionality

  Scenario Outline: Test login functionality
  Given Open <Browser> and start application.
  When I enter <username> and <password>
  And I click on Login button
  Then user should be see the home page
  And I close the browser
  
 Examples:
 |Browser|username|password|
 |Chrome|deb_saheb8@yahoo.co.in|debashish@123|
  
  
  