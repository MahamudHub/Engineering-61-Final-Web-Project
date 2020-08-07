Feature: As a User, I want to see the status and time so that I can see if the results have been retrieved.

  Scenario: See the status of the candidate assessment
    Given I have to have sent a candidate an assessment
    When on the polls page should see the candidate assessment status.
    Then the status will show the current state of the assessment.