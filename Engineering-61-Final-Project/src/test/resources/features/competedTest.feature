Feature: If test sent to candidate is completed or not

  @CompletedTest
  Scenario: candidate contacted and completed test
    Given A candidate has been sent a test
    When The candidate has submitted the test
    And I go to the dispatches page
    Then I should see a Yes under Complete

    @IncompleteTest
  Scenario: candidate contacted and incomplete test
    Given A candidate has been sent a test
    When The candidate has not submitted the test
    And I go to the dispatches page
    Then I should see a No under Complete

#  Scenario: candidate has not been contacted and completed a test
#  Scenario: candidate has not been contacted and incomplete test

