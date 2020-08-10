Feature: As a User, I want to see the status and time so that I can see if the results have been retrieved.

  Scenario: See the status of the candidate assessment
    Given I have to have sent a candidate an assessment
    When I check the candidate assessment status.
    Then it will show the current state

  Scenario: See latest poll time update
    Given I have updated the poll on the results page
    And  the poll has not updated automatically
    When I check the time of the last poll
    Then it will be the same as when I updated the poll

    Scenario: See the testID
      Given I have sent the candidate an assessment
      When I go on the poll page
      Then I will see the TestID

      Scenario: See the email address
        Given I have sent the candidate an assessment
        When I go on the poll page
        Then I will see the email address of the candidate