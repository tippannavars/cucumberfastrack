Feature: FT login page application test
Scenario: verify that user is able to login through the valid credentilas
Given launch the browser
When user is on login page
Then enter the credentials and click on signin button
#Then on homepage check the title
Then click on watches category
Then close the browser