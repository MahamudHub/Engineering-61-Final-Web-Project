Feature: Recruiter details

  @RecruiterEmailPresent
  Scenario: Seeing recruiter's email
    Given A recruiter has contacted a candidate
    When I go to the dispatches page and see Recruiter
    Then I should see the recruiter's email

