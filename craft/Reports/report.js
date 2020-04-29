$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "OKR Login",
  "description": "This feature verify the Login Functionality",
  "id": "okr-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check Login Functionality with correct credentials",
  "description": "",
  "id": "okr-login;check-login-functionality-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is at OKR login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter \"deepanjali.chaudhary@infoprolearning.com\" in Email field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter \"abcd@1234\" in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on Sign In Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "login should be sucessful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.invokeApplication()"
});
formatter.result({
  "duration": 13449013500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "deepanjali.chaudhary@infoprolearning.com",
      "offset": 12
    }
  ],
  "location": "stepDefinition.user_Enter_in_Email_field(String)"
});
