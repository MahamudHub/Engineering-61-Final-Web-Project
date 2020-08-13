Feature: Being able to login

  Scenario: Two Correct credentials
    Given I enter the correct username
    And I enter the correct password
    When I click the LOGIN button
    Then I will see the Send Assessment Page

    Scenario: Two Wrong credentials
      Given I enter the wrong username
      And I enter the wrong password
      When I click the LOGIN button
      Then I will see the Error message

  Scenario:  No credentials
    Given I do not enter my credentials
    When I click the LOGIN button
    Then I will see the Error message

  Scenario: Wrong username
    Given I enter the wrong username
    And I enter the correct password
    When I click the LOGIN button
    Then I will see the Error message

  Scenario: Wrong password
    Given I enter the correct username
    And I enter the wrong password
    When I click the LOGIN button
    Then I will see the Error message
