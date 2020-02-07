@tourHomePage
  Feature: Home Page Test
    Scenario: Verify Home Page Title
      Given User open Home Page
      And User sees "packages "
      And User clicks "Third Trip"
      Then User Verify "Tour page Title"
      When User sees pop up window "Packages Booking"
      And User fills out information
      When User clicks Search Button



#
#    @ScenarioOutline
#    Scenario Outline: Verify the Best Tour
#      Given User open Home Page
#      When User clicks " First Feature Tour"
#      Then  User Verify the " First Tour Title"
#      And User sees page "Link"
#      Examples:
#        | Link            |
#        | Special Fares   |
#        | Fly and Save    |





