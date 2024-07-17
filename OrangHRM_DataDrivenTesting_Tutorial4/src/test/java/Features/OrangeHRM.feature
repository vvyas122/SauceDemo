 
 Feature: Test the OrangeHRM Application


Scenario: Validate login functionality


Given user is on login Page
When user enter valid username and password
|Admin|admin123|
Then user click on login button