Feature: As a User, I want to see check all the information on the results page is displayed and correct

  Scenario: See the results of the candidate assessment
    Given The candidate has completed the assessment
    When I am on the results page
    Then I should see the score is displayed

  Scenario: See the email for each candidate is correct
    Given The candidate has completed the assessment
    When I am on the results page
    Then It should be the same as the dispatch page

  Scenario: See the name for each candidate who has done the test
    Given The candidate has completed the assessment
    When I am on the results page
    Then I should see the name of the candidate

  Scenario: See the candidate NR
    Given The candidate has completed the assessment
    When I am on the results page
    Then I should see the candidate NR

  Scenario: See the candidate LR
    Given The candidate has completed the assessment
    When I am on the results page
    Then I should see the candidate LR

  Scenario: Click the update button
    Given The update button is displayed
    When I click the update button
    Then I should see the polls page



