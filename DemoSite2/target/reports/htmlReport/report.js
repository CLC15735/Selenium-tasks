$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "Login into a website",
  "description": "As a person\r\nI want to generate a new user\r\nSo that I can login into my account",
  "id": "login-into-a-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5843109100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Create a new user",
  "description": "",
  "id": "login-into-a-website;create-a-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to the \u0027Add a User\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I can generate a new user using the following",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11
    },
    {
      "cells": [
        "root",
        "root"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I can login using the new credentials",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 15
    },
    {
      "cells": [
        "root",
        "root"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.the_correct_web_address()"
});
formatter.result({
  "duration": 719470500,
  "status": "passed"
});
formatter.match({
  "location": "WebTest.i_navigate_to_the_Add_a_User_page()"
});
formatter.result({
  "duration": 247692900,
  "status": "passed"
});
formatter.match({
  "location": "WebTest.i_can_generate_a_new_user_using_the_following(DataTable)"
});
formatter.result({
  "duration": 304693900,
  "status": "passed"
});
formatter.match({
  "location": "WebTest.i_can_login_using_the_new_credentials(DataTable)"
});
formatter.result({
  "duration": 745407800,
  "status": "passed"
});
formatter.after({
  "duration": 604364800,
  "status": "passed"
});
});