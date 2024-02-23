$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Accounts.feature");
formatter.feature({
  "name": "Codefios page login functionality validation Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_is_on_the_codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo1@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.DashboardSteps.user_is_on_the_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on List Accounts",
  "keyword": "When "
});
formatter.match({
  "location": "steps.DashboardSteps.user_clicks_on_List_Accounts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on the account list page",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AccountStep.user_is_on_account_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on add account button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AccountStep.the_user_clicks_on_add_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters account name as \"Agam Sahni\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AccountStep.the_user_enters_account_name_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters description as \"TechFios\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AccountStep.the_user_enters_description_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters initial balance as \"50\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AccountStep.the_user_enters_intial_balance_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters account number as \"34589\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AccountStep.the_user_enters_account_number_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters contact person as \"SRK\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AccountStep.the_user_enters_contact_person_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the save button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AccountStep.the_user_clicks_the_save_button()"
});
formatter.result({
  "status": "passed"
});
});