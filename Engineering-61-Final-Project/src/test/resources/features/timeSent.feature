Feature: Time the test was sent to a candidate
  Scenario: Candidate was contacted
    Given A test was sent to a candidate
    When I go to the dispatches page to see time sent
    Then I should see the time the test was sent

