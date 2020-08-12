Feature: Assessment Type details
  Scenario: Test with Psychometric
    Given The recruiter chooses a test
    And Ticks the Psychometric test
    When I go to the Dispatches page
    Then I should see both test types under Assessment type

  Scenario: Test without Psychometric
    Given The recruiter chooses a test
    And Does not tick the Psychometric test
    When I go to the Dispatches page
    Then I should see only one test under Assessment type

  Scenario: Just Psychometric test
    Given The recruiter chooses a Psychometric test
    When I go to the Dispatches page
    Then I should see only a Psychometric test under Assessment type
