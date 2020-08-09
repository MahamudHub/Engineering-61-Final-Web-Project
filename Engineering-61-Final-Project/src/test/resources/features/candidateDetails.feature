Feature: Candidate details
  Scenario: Seeing candidate's name
    Given A candidate has been contacted
    When I go to the dispatches page
    Then I should see their name

    Scenario: Seeing candidate's email
      Given A candidate has been contacted
      When I go to the dispatches page
      Then I should see their email

