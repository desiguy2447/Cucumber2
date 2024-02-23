Feature: Codefios page login functionality validation Page

 Scenario: User should be able to login with valid credentials
  Given User is on the codefios login page
  When User enters username as "demo1@codefios.com"
  When User enters password as "abc123"
  When User clicks on sign in button

  Then User is on the dashboard page
  When User clicks on List Accounts
  
  When User is on the account list page
  When the user clicks on add account button
  When the user enters account name as "Agam Sahni"
  When the user enters description as "TechFios"
  When the user enters initial balance as "50"
  When the user enters account number as "34589"
  When the user enters contact person as "SRK"
  When the user clicks the save button
  Then User should be able to see account added alert
 
  
