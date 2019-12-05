$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/dataTable.feature");
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
});