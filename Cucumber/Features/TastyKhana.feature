@tastykhana
Feature: Tastykhana functionality

Background:
Given Open browser and start application.

  Scenario: Tastykhana login functionality
  When I enter city and area
  |city|Pune|
  |area|Anand Nagar (Kothrud)|
  
  Then user should be see the "Anand Nagar (Kothrud)" food panda page
  #And I select restaurant as
  #|Restaurant|Rolls Mania (Karishma society)|
  #When I select menu item
  #|Menu|Aloo Chili Roll (ACR)|47.62|
  
  #And I close the browser
  
  
  
  