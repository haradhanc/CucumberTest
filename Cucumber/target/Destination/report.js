$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebook.feature");
formatter.feature({
  "line": 2,
  "name": "Facebook functionality",
  "description": "",
  "id": "facebook-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@facebook52"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Test login functionality",
  "description": "",
  "id": "facebook-functionality;test-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open \u003cBrowser\u003e and start application.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be see the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "facebook-functionality;test-login-functionality;",
  "rows": [
    {
      "cells": [
        "Browser",
        "username",
        "password"
      ],
      "line": 12,
      "id": "facebook-functionality;test-login-functionality;;1"
    },
    {
      "cells": [
        "Chrome",
        "deb_saheb8@yahoo.co.in",
        "debashish@123"
      ],
      "line": 13,
      "id": "facebook-functionality;test-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Test login functionality",
  "description": "",
  "id": "facebook-functionality;test-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@facebook52"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Chrome and start application.",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter deb_saheb8@yahoo.co.in and debashish@123",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be see the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 5
    }
  ],
  "location": "CommonStepDefinitions.Open_browser_and_start_application(String)"
});
formatter.result({
  "duration": 17591543190,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CommonStepDefinitions.I_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CommonStepDefinitions.user_should_be_see_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CommonStepDefinitions.I_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});