Feature: As a User, I want the candidate to be able to access their link from their email account

  Scenario: Sending the candidate an email.
    Given I have sent the candidate an assessment link email
    When they access their email
    Then they will find an email from Sparta Global

  Scenario: Sending the candidate an email with a codeingame link.
    Given I have sent the candidate an assessment link email
    When they click the link within the email
    Then they will be taken to the Codeingames test