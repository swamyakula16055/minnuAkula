Feature: login feature

  @loginT
  Scenario: user login successfully
    Given user navigates to url
    When user enters username and password
    Then login successfully
