Feature: Being able to log out

  @LogOutFromSendAssessmentPage
  Scenario: Logging out from Send Assessment page
    Given I am on the Send Assessment page
    When I click the Logout link
    Then I will see the Logout page

    @LoggingOutFromDispatcherPage
  Scenario: Logging out from Dispatches page
    Given I am on the Dispatches page
    When I click the Logout link
    Then I will see the Logout page

      @LoggingOutFromResultsPage
  Scenario: Logging out from Results page
    Given I am on the Results page
    When I click the Logout link
    Then I will see the Logout page

        @LoggingOutFromPollsPage
  Scenario: Logging out from Polls page
    Given I am on the Polls page
    When I click the Logout link
    Then I will see the Logout page
