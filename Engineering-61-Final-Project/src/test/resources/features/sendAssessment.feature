Feature: As a user I want send an assessment to a candidate

  Scenario: Sending a candidate an assessment, need to find candidate name field.
    Given I have to contact a candidate to send an assessment
    When I'm on the Send Assessment page
    Then I will see a placeholder in the field to enter candidate name.

  Scenario: Sending a candidate an assessment, need to find candidate email field.
    Given I have to contact the candidate an assessment
    When I'm on the Send Assessment page
    Then I will see a placeholder in the field to enter candidate email

  Scenario: Sending a candidate an assessment, need to find recruiter email field.
    Given I have to contact the candidate an assessment
    When I'm on the Send Assessment page
    Then I will be a placeholder in the field to enter recruiter email

  Scenario: Sending a candidate an assessment, selecting Psychometric Assessment.
    Given I have to send the candidate an assessment
    When I select Psychometric Assessment
    Then there will not be a checkbox to send Psychometric Assessment

  Scenario: Sending a candidate an assessment, need to see number of assessments.
    Given I have to sent the candidate an assessment need to select the assessment
    When I see a dropdown list i should see the number of assessments
    Then there will not be five assessments to select from

  Scenario: Sending the the assessment.
    Given I have filled all the fields to send assessment
    When on the Send Assessment page.
    Then the submit will be visable to send assessment to the candidate.

  Scenario: Entering the candidate name to send assessment
    Given I have to send a candidate an assessment
    When I need to enter candidate name
    Then I will enter the candidate name in the field.

  Scenario: Entering the candidate email to send assessment
    Given I have to send the candidate an assessment
    When I need to enter candidate email
    Then I will enter the candidate email in the correct field

  Scenario: Entering the recruiter email to send assessment
    Given I have sent the candidate an assessment
    When I need to enter recruiter email
    Then I will enter the recruiter email in the correct field

  Scenario: Selecting the assessment to send to the candidate.
    Given I have to sent the candidate an assessment
    When I need to select the assessment
    Then I will select the assessment to send to the candidate.
