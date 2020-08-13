Feature: As a User, I want to see check all the information on the results page is displayed and correct

  @ScoreForCandidateAssessment
  Scenario: See the results of the candidate assessment
    Given The candidate has completed the assessment
    When I am on the results page
    Then I should see the score is displayed

    @EmailCorrectInResultsPage
  Scenario: See the email for each candidate is correct
    Given The candidate has completed the assessment
    When I am on the results page
    Then It should be the same as the dispatch page

      @EachNameDisplayedInResultsPage
  Scenario: See the name for each candidate who has done the test
    Given The candidate has completed the assessment
    When I am on the results page
    Then I should see the name of the candidate

        @CandidateNRDisplayed
  Scenario: See the candidate NR
    Given The candidate has completed the assessment
    When I am on the results page
    Then I should see the candidate NR

          @CandidateLRDisplayed
  Scenario: See the candidate LR
    Given The candidate has completed the assessment
    When I am on the results page
    Then I should see the candidate LR

            @UpdateButtonFunctions
  Scenario: Click the update button
    Given The update button is displayed
    When I click the update button
    Then I should see the polls page



