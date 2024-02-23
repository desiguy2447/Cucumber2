Feature: Codefios page login functionality validation Page

 Scenario: User should be able to login with valid credentials
  Given User is on the codefios login page
  When User enters username as "demo1@codefios.com"
  When User enters password as "abc123"
  When User clicks on sign in button
  Then User should be landing on a dashboard page
 

Scenario:1 - User should not be able to login with invalid credential
Given User is on the codefios login page
When User enters username as "demo1@codefios.com"
When User enters password as "abc124"
And User clicks on sign in button
Then User should be landing on a dashboard page