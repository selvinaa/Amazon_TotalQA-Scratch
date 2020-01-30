$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/homePage.feature");
formatter.feature({
  "name": "Home Page Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homePage"
    }
  ]
});
formatter.scenario({
  "name": "Verify Home Page Title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homePage"
    },
    {
      "name": "@verifyHomeTitle"
    }
  ]
});
formatter.step({
  "name": "User open Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage_STEPS.user_open_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks \"Java Basics Button\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage_STEPS.user_clicks(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click \"Java OOps\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage_STEPS.user_click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees pop up",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage_STEPS.user_sees_pop_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click \"Close pop up\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage_STEPS.user_click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the \"Java OOPS, Inheritance, Abstract Class, Interface,Polymorphism\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_STEPS.user_verify_the(String)"
});
formatter.result({
  "status": "passed"
});
});