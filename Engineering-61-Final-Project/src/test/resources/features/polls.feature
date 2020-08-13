Feature: As a User, I want to see the status and time so that I can see if the results have been retrieved.

    Scenario: Check waiting status
      Given I have sent the candidate an assessment
      When I go on the poll page
      Then The status will say waiting

      Scenario: Check completed status
        Given I have sent the candidate an assessment
        And The candidate has completed the assessment
        When I go on the poll page
        Then The status will say completed

        Scenario: Check expired status
          Given I have sent the candidate an assessment
          And The time has expired
          When I go on the poll page
          Then The status will say expired

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