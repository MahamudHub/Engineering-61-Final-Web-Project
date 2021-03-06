Feature: As a user I want send an assessment to a candidate

  @FieldForCandidateName
  Scenario: Sending a candidate an assessment, need to find candidate name field.
    Given I have to contact a candidate to send an assessment
    When I'm on the Send Assessment page
    Then I will see a placeholder in the field to enter candidate name.

    @FieldForCandidateEmail
  Scenario: Sending a candidate an assessment, need to find candidate email field.
    Given I have to contact a candidate to send an assessment
    When I'm on the Send Assessment page
    Then I will see a placeholder in the field to enter candidate email

      @FieldForRecruiterEmail
  Scenario: Sending a candidate an assessment, need to find recruiter email field.
    Given I have to contact a candidate to send an assessment
    When I'm on the Send Assessment page
    Then I will be a placeholder in the field to enter recruiter email

        @SelectingPsychometricAssessment
  Scenario: Sending a candidate an assessment, selecting Psychometric Assessment.
    Given I have to send the candidate an assessment
    When I select Psychometric Assessment
    Then there will not be a checkbox to send Psychometric Assessment

          @NumberOfAssessments
  Scenario: Sending a candidate an assessment, need to see number of assessments.
    Given I have to sent the candidate an assessment need to select the assessment
    When I see a dropdown list i should see the number of assessments
    Then there will not be five assessments to select from

            @SendingAssessment
  Scenario: Sending the the assessment.
    Given I have filled all the fields to send assessment
    When I'm on the Send Assessment page
    Then the submit will be visible to send assessment to the candidate.

              @EnterCandidateName
  Scenario: Assessment sent will include name
    Given I have to contact a candidate to send an assessment
    When I entered the candidate name
    Then i click submit i will see candidate name on Assessment Sent

                @EnterCandidateEmail
  Scenario: Assessment sent will include email
    Given I have to contact a candidate to send an assessment
    When I entered candidate email
    Then i click submit i will see candidate email on Assessment Sent

  @SendAssessmentToCandidate
  Scenario: Assessment sent will include email
    Given I have to contact a candidate to send an assessment
    When I entered candidate details
    Then i click submit i will send the candidate an Assessment