Feature: Time the test was sent to a candidate
  Scenario: Candidate was contacted
    Given A test was sent to a candidate
    When I go to the dispatches page
    Then I should see the time the test was sent

#  Scenario: Candidate was not contacted
#    Given A test was not sent to a candidate
#    When I open the dispatches page
#    Then I should not see the time the test was sent
#

