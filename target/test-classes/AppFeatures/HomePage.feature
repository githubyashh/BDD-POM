#Author: Yash Hirpara

Feature: Home Page feature

Background: 
  Given user has already logged in to application
  |username|password|
  |AutomationPractice@gmail.com|givePassword1122|


  Scenario: Checking title of Home Page
  
    Given user is on Home Page
    When user checks title of the page
    Then page title should be "Automation Exercise"
    And check username of an account
    Then username should be "Logged in as Yash1"

