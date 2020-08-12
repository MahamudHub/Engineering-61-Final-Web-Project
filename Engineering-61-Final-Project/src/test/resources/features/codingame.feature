Feature: As a User, I want the candidate to be able to complete the test so that....

  @EnterFirstQuestionAnswer
  Scenario: Candidate has to answer the first question
    Given The Candidate has started the test
    When The Candidate clicks on the first question
    Then The Candidate can answer the first question

    @EnterSecondQuestionAnswer
  Scenario: Candidate has to answer the second question
    Given The Candidate has started the test
    When The Candidate clicks on the second question
    Then The Candidate can answer the second question

@EnterThirdQuestionAnswer
  Scenario: Candidate has to answer the third question
    Given The Candidate has started the test
    When The Candidate clicks on the third question
    Then The Candidate can answer the third question

  @EnterFourthQuestionAnswer
  Scenario: Candidate has to answer the fourth question
    Given The Candidate has started the test
    When The Candidate clicks on the fourth question
    Then The Candidate can answer the fourth question

    @SubmitTest
  Scenario: Candidate completes test
    Given The Candidate has started the test
    When The Candidate is satisfied with his answers
    Then The Candidate submits the test
