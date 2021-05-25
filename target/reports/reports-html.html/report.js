$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/heyheySignup.feature");
formatter.feature({
  "name": "HeyHey Apis",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter his details to create account",
  "keyword": "Given "
});
formatter.match({
  "location": "com.heyhey.stepDefinition.UserSignupTestSteps.user_enter_his_details_to_create_account()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.heyhey.stepDefinition.UserSignupTestSteps.user_enter_his_details_to_create_account(UserSignupTestSteps.java:50)\r\n\tat ✽.user enter his details to create account(file:///C:/Users/India/eclipse-workspace/f22labs/src/test/resources/features/heyheySignup.feature:4)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "",
  "description": "\t\tCreate a user account",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user submit the request to create account",
  "keyword": "When "
});
formatter.match({
  "location": "com.heyhey.stepDefinition.UserSignupTestSteps.user_submit_the_request_to_create_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Account is created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.heyhey.stepDefinition.UserSignupTestSteps.account_is_created_successfully()"
});
formatter.result({
  "status": "skipped"
});
});