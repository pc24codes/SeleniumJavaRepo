Feature: LoginFeature

  @Regression
  Scenario: User launches google
    When User launches google
    Then User searches

    @SmokeTest
  Scenario: User Logged in as Standard User
    When User launches SauceDemo
    Then User enters the credentials
    Then User logs in to SauceDemo

  @SmokeTest
  Scenario: User logged in as