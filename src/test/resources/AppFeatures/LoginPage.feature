#Author: Yash Hirpara
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

@Smoke @Regression
Feature: Login page feature

  Scenario: Title of your scenario 
    Given user is on login page
    When user checks title of the page
    Then page title should be "Automation Exercise - Signup / Login"

  Scenario: Login with correct credential
    Given user is on login page
    When user enters username "AutomationPractice@gmail.com"
    And user enters password "givePassword1122"
    And user clicks on login button
    Then user gets title of the page
    And login page title should be "Automation Exercise"

