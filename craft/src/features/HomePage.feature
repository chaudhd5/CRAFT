Feature: OKR Login
This feature verify the Login Functionality

Scenario: Check Login Functionality with correct credentials
Given User is at OKR login page
When User Enter "deepanjali.chaudhary@infoprolearning.com" in Email field
And User Enter "abcd@1234" in Password field
And user click on Sign In Button
Then login should be sucessful


#Scenario Outline: Check Login Functionality with correct credentials
#Given User is at OKR login page
#When User Enter "<UserName>" in Email field And User Enter "<UserPassword>" in Password field
#And user click on Sign In Button
#Then login should be sucessful
#
#Examples:
#| UserName | UserPassword |
#| deepanjali.chaudhary@infoprolearning.com| abcd@1234 |
#| anurag.chaudhari@infoprolearning.com| abcd@1234 |
#
