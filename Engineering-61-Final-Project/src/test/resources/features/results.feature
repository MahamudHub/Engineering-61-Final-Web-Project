Feature: As a User, I want to see the status and time so that I can see if the results have been retrieved.

  Scenario: See the status of the candidate assessment
    Given I have sent the candidate an assessment
    When I check the score of the assessment
    Then the score is displayed