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
      "name": "@facebook1"
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
  "duration": 28492496637,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Test login functionality",
  "description": "",
  "id": "facebook-functionality;test-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I enter username as \"deb_saheb8@yahoo.co.in\" and password \"debashish@123\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be see the home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "deb_saheb8@yahoo.co.in",
      "offset": 21
    },
    {
      "val": "debashish@123",
      "offset": 59
    }
  ],
  "location": "CommonStepDefinitions.login(String,String)"
});
formatter.result({
  "duration": 181022243233,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinitions.I_click_on_login_button()"
});
formatter.result({
  "duration": 1514660175,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefinitions.user_should_be_see_the_home_page()"
});
formatter.result({
  "duration": 6553225697,
  "status": "passed"
});
});