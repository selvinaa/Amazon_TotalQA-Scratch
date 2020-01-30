@homePage
  Feature: Home Page Test
    @verifyHomeTitle
    Scenario: Verify Home Page Title
      Given User open Home Page
      When User clicks "Java Basics Button"
      And User click "Java OOps"
      And User sees pop up
      When User click "Close pop up"
      Then User verify the "Java OOPS, Inheritance, Abstract Class, Interface,Polymorphism"
