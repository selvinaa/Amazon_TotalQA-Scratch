$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TourhomePage.feature");
formatter.feature({
  "name": "Home Page Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tourHomePage"
    }
  ]
});
formatter.scenario({
  "name": "Verify Home Page Title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tourHomePage"
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
  "name": "User sees \"packages \"",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage_STEPS.user_sees(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks \"Third Trip\"",
  "keyword": "And "
});
formatter.match({
  "location": "TourHomePage_STEPS.user_clicks(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify \"Tour page Title\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TourHomePage_STEPS.user_Verify(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees pop up window \"Packages Booking\"",
  "keyword": "When "
});
formatter.match({
  "location": "TourHomePage_STEPS.user_sees_pop_up_window(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills out information",
  "keyword": "And "
});
formatter.match({
  "location": "TourHomePage_STEPS.user_fills_out_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Search Button",
  "keyword": "When "
});
formatter.match({
  "location": "TourHomePage_STEPS.user_clicks_Search_Button()"
});
formatter.result({
  "status": "passed"
});
});