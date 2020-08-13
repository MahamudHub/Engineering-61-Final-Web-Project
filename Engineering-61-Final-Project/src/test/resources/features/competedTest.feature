Feature: If test sent to candidate is completed or not

  @CompletedTest
  Scenario: candidate contacted and completed test
    Given A candidate has been sent a test
    When The candidate has submitted the test
    And I go to Dispatches to see if test is complete
    Then I should see a Yes under Complete

    @IncompleteTest
  Scenario: candidate contacted and incomplete test
    Given A candidate has been sent a test
    When The candidate has not submitted the test
    And I go to Dispatches to see if test is complete
    Then I should see a No under Complete

