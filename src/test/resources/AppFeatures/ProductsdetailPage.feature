
Feature: Checking Details
	Background:
	Given user has already logged in to application
	 |username|password|
  |AutomationPractice@gmail.com|givePassword1122|

 Scenario Outline: Review an item
  	Given user is on products detail page
    Then user enters "<name>" ,gives "<email>" and describes "<review>"
    Then user click on submit
    Examples:
      | name  | email                       | review  |
      | Yash  |   yashhirpara555@gmail.com   |  I really liked this product, thank you seller. |
      | Hrithik|  hrithikroshan555@gmail.com | Best price, and color is good.  |

  