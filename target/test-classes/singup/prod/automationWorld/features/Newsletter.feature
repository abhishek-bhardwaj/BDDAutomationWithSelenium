Feature: Newsletter subscription
  @test
  Scenario:When valid email ID entered and signup button clicked
    Given When User is on home page
    When  Valid email id is entered and signUp button clicked
    Then Successful message should appear and user should get Email

#  Scenario:When no email ID entered and signup button clicked
#    Given When User is on home page
#    When  no email id is entered and signUp button clicked
#    Then Successful message should appear and user should get Email