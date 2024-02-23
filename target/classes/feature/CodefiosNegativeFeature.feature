Feature: Codefios page login functionality validation Page

Scenario:1 - User should not be able to login with wrong credential
Given User is on the codefios login page
When User enters username as "demo1@codefios.com"
When User enters password as "abc124"
And User clicks on sign in button
Then User should be landing on a dashboard page


Scenario:2 - User should not be able to login with invalid credential
Given User is on the codefios login page
When User enters username as "demo1@codefios.com"
When User enters password as "abc124"
And User clicks on sign in button
Then User should be landing on a dashboard page


