Feature: As a User, I want the candidate to be able to access their link from their email account

  Scenario: Receiving the Assessment Link Email.
    Given I have sent the candidate an assessment link email
    When they click the link within the email
    Then they will be taken to the Codeingames test

  Scenario: Not Receiving the Assessment Link Email.
    Given I have not sent an assessment link email to the candidate
    When they search for an Assessment Link email
    Then they will not find the assessment link

  Scenario: Receiving an invalid link
    Given I have sent the candidate an assessment link email
    When they click the link within the email
    Then they will be taken to an invalid link

  Scenario: Receiving the Assessment Link Email with no link.
    Given Given I have sent the candidate an assessment link email
    When they open the assessment email
    Then they will find that there is no assessment link