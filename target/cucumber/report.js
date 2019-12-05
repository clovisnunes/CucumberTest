$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/annotation.feature");
formatter.feature({
  "name": "annotation",
  "description": "\tVerify login fail when user enters incorrect username and password ",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "\tUser navigates to Faceboook",
  "keyword": "Background"
});
formatter.step({
  "name": "I am on Facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "annotation.goToFacebook()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Forgot Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ReadyForTest"
    }
  ]
});
formatter.step({
  "name": "I click on Forgot Account option",
  "keyword": "When "
});
formatter.match({
  "location": "annotation.clickForgot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to Find your account page",
  "keyword": "Then "
});
formatter.match({
  "location": "annotation.checkForgotPage()"
});
formatter.result({
  "status": "passed"
});
});