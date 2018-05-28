$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TastyKhana.feature");
formatter.feature({
  "line": 2,
  "name": "Tastykhana functionality",
  "description": "",
  "id": "tastykhana-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tastykhana"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open browser and start application.",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepDefinitions.Open_browser_and_start_application()"
});
formatter.result({
  "duration": 14204422098,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Tastykhana login functionality",
  "description": "",
  "id": "tastykhana-functionality;tastykhana-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I enter city and area",
  "rows": [
    {
      "cells": [
        "city",
        "Pune"
      ],
      "line": 9
    },
    {
      "cells": [
        "area",
        "Anand Nagar (Kothrud)"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should be see the \"Anand Nagar (Kothrud)\" food panda page",
  "keyword": "Then "
});
formatter.match({
  "location": "TastyKhanaPageStepDefinition.I_enter_city_and_area(DataTable)"
});
