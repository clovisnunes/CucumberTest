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
formatter.before({
  "status": "passed"
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
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/dataTable.feature");
formatter.feature({
  "name": "New user registration",
  "description": "\tVerify that the new user registration is unsuccessful after passing the incorrect inputs",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "New user fail inputs",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ReadyForTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the new user registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "dataTable.goToFacebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ]
    },
    {
      "cells": [
        "First Name",
        "Tom"
      ]
    },
    {
      "cells": [
        "Last Name",
        "Kenny"
      ]
    },
    {
      "cells": [
        "Email Address",
        "someone@someone.com"
      ]
    },
    {
      "cells": [
        "Re-enter Email Address",
        "someone@someone.com"
      ]
    },
    {
      "cells": [
        "Password",
        "Password1"
      ]
    },
    {
      "cells": [
        "Birthdate",
        "01"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "dataTable.enterData(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User registration should be unsucessful",
  "keyword": "Then "
});
formatter.match({
  "location": "dataTable.userRegistrationUnsucessful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});