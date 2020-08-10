Feature: As a User, I want to see check all the information on the results page is displayed and correct

  Scenario: See the results of the candidate assessment
    Given I have sent the candidate an assessment
    When I check the score of the assessment
    Then the score is displayed

  Scenario: See the email for each candidate is correct
    Given I am on the results page
    When I see the candidates email
    Then It should be the same as the dispatch page

  Scenario: See the name for each candidate who has done the test
    Given I have sent the candidate an assessment
    When I am on the results page
    Then I should see the name of the candidate

  Scenario: See the candidate NR
    Given I am on the results page
    When I look at the NR Column
    Then I should see the candidate NR

  Scenario: See the candidate LR
    Given I am on the results page
    When I look at the LR Column
    Then I should see the candidate LR

  Scenario: Click the update button
    Given The update button is displayed
    When I click the update button
    Then I should see the polls page



