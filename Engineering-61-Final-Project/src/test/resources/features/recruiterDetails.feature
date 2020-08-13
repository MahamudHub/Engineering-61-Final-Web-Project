Feature: Recruiter details

  @RecruiterEmailPresent
  Scenario: Seeing recruiter's email
    Given A recruiter has contacted a candidate
    When I go to the dispatches page
    Then I should see the recruiter's email

#  Scenario: No recruiter's email
#    Given A recruiter has not contacted a candidate
#    When I go to the dispatches page
#    Then I should not see the recruiter's email
