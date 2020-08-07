Feature: As a user I want send an assessment to a candidate

  Scenario: Sending a candidate an assessment, need to find candidate name filed.
    Given I have to have a candidate to send an assessment to need to enter candidate name
    When on the Send Assessment page see a filed to enter candidate name.
    Then there will be a placeholder in the field to enter candidate name.

  Scenario: Sending a candidate an assessment, need to find candidate email filed.
    Given I have to sent the candidate an assessment need to enter candidate email
    When on the Send Assessment page see a filed to enter candidate email.
    Then there will be a placeholder in the field to enter candidate email

  Scenario: Sending a candidate an assessment, need to find recruiter email filed.
    Given I have to sent the candidate an assessment need to enter recruiter email
    When on the Send Assessment page see a filed to enter recruiter email
    Then there will be a placeholder in the field to enter recruiter email

  Scenario: Sending a candidate an assessment, need to select Psychometric Assessment.
    Given I have to sent the candidate an assessment need to select the assessment
    When on the Send Assessment page see a dropdown list select Psychometric Assessment
    Then there will not be a checkbox to send Psychometric Assessment

  Scenario: Sending a candidate an assessment, need to see number of assessments.
    Given I have to sent the candidate an assessment need to select the assessment
    When on the Send Assessment page see a dropdown list see number of assessments
    Then there will not be five assessments to select from

  Scenario: Sending the the assessment.
    Given I have filled all the fields to send assessment
    When on the Send Assessment page.
    Then the submit will be visable to send assessment to the candidate.

  Scenario: Entering the candidate name to send assessment.
    Given I have to sent the candidate an assessment need to enter candidate name
    When on the Send Assessment page.
    Then will enter the candidate name in the field.

  Scenario: Entering the candidate email to send assessment.
    Given I have to sent the candidate an assessment need to enter candidate email
    When on the Send Assessment page.
    Then will enter the candidate email in the field.

  Scenario: Entering the recruiter email to send assessment.
    Given I have sent the candidate an assessment need to enter recruiter email who is sending the assessments
    When on the Send Assessment page.
    Then will enter the recruiter email in the field.

  Scenario: Selecting the assessment to send to the candidate.
    Given I have to sent the candidate an assessment need to select the assessment
    When on the Send Assessment page.
    Then they will select the assessment to send to the candidate.

  Scenario: Sending the the assessment.
    Given I have filled all the fields to send assessment
    When on the Send Assessment page.
    Then they will click submit to send assessment to the candidate.