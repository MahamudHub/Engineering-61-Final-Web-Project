Feature: Candidate details
  Scenario: Seeing candidate's name
    Given A candidate has been contacted
    When I go to the dispatches page
    Then I should see their name

    Scenario: Seeing candidate's email
      Given A candidate has been contacted
      When I go to the dispatches page
      Then I should see their email

  Scenario: Seeing no candidate name
    Given A candidate has not been contacted
    When I go to the dispatches page
    Then I should not see their name

  Scenario: Seeing no candidate email
    Given A candidate has not been contacted
    When I go to the dispatches page
    Then I should not see their email