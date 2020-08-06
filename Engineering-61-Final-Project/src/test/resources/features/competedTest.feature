Feature: If test sent to candidate is completed or not
  Scenario: candidate contacted and complete test
    When A candidate has been sent a test
    Given The candidate has submitted the test
    And I open the dispatches page
    Then I should see a Yes under Complete

  Scenario: candidate contacted and incomplete test
    When A candidate has been sent a test
    Given The candidate has not submitted the test
    And I open the dispatches page
    Then I should see a No under Complete

  Scenario: candidate has not been contacted and completed a test
    When A candidate has not been sent a test
    Given The candidate has attempted the test
    And I open the dispatches page
    Then I should see a No under Complete

  Scenario: candidate has not been contacted and incomplete test
    When A candidate has not been sent a test
    Given The candidate has not attempted the test
    And I open the dispatches page
    Then I should see a No under Complete
