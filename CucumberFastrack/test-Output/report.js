$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Cucumberframework/CucumberFastrack/src/Features/FTlogin.feature");
formatter.feature({
  "line": 1,
  "name": "FT login page application test",
  "description": "",
  "id": "ft-login-page-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "verify that user is able to login through the valid credentilas",
  "description": "",
  "id": "ft-login-page-application-test;verify-that-user-is-able-to-login-through-the-valid-credentilas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter the credentials and click on signin button",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#Then on homepage check the title"
    }
  ],
  "line": 7,
  "name": "click on watches category",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FThomepagestep.launch_the_browser()"
});
formatter.result({
  "duration": 60604919068,
  "status": "passed"
});
formatter.match({
  "location": "FThomepagestep.user_is_on_login_page()"
});
formatter.result({
  "duration": 43629917100,
  "status": "passed"
});
formatter.match({
  "location": "FThomepagestep.enter_the_credentials_and_click_on_signin_button()"
});
formatter.result({
  "duration": 808134685,
  "status": "passed"
});
formatter.match({
  "location": "FThomepagestep.click_on_watches_category()"
});
formatter.result({
  "duration": 3230866,
  "status": "passed"
});
formatter.match({
  "location": "FThomepagestep.close_the_browser()"
});
formatter.result({
  "duration": 3034951601,
  "status": "passed"
});
});