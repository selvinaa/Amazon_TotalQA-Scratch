@homePage
  Feature: Home Page Test
    Scenario: Verify Home Page Title
      Given User open Home Page
      When User sees "First Tour"
      Then User Verify "Home Page Title"
      When User clicks "First Tour"
      And User sees "packages "
      And User clicks "Third Trip"
      Then User Verify "Tour page Title"
      When User sees pop up window
      And User fills out information
      When User clicks Search Button




#    @ScenarioOutline:
#    Scenario Outline: Verify the Best Tour
#      Given User open Home Page
#      When User clicks " First Feature Tour"
#      Then  User Verify the " First Tour Title"
#      And User sees page "Link"
#      Examples:
#        | link            |
#        | Special Fares   |
#        | Fly and Save    |





