Feature: As a User, I want the candidate to be able to complete the test so that they can

  Scenario: I have to start the test
    Given I open the Codingame link
    When I click the Start button
    Then The test will start


#  Scenario: I have to agree with the terms and conditions
#    Given I have to start the test
#    When I am on the start page
#    Then I need to select the terms and conditions button
#
#  Scenario: I have to continue to start the test
#    Given I have to start the test
#    When I am on the start page
#    Then I need to click on the second Start button

  Scenario: I have to do the correct question
    Given I am on the menu page
    When I click on the required question
    Then I will be prompted to the required question

#  Scenario: I have to click the option of my choice
#    Given I have to do the correct question
#    When I am in the question page
#    Then I need to click the correct option
#
#  Scenario: I have to submit my answer to the question
#    Given I have to do the correct question
#    When I am in the question page
#    Then I need to click the submit answer button

  Scenario: I have to finish my test
    Given I have to submit my test
    When I click submit
    Then The test will be submitted
