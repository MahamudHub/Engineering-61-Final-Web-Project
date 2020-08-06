Feature: Being able to log out
  Scenario: Logging out from Send Assessment page
    Given I am on the Send Assessment page
    When I click the Logout link
    Then I will see the Logout page

  Scenario: Logging out from Dispatches page
    Given I am on the Dispatches page
    When I click the Logout link
    Then I will see the Logout page

  Scenario: Logging out from Results page
    Given I am on the Results page
    When I click the Logout link
    Then I will see the Logout page

  Scenario: Logging out from Polls page
    Given I am on the Polls page
    When I click the Logout link
    Then I will see the Logout page
