Feature: Login

  Scenario: Login valid
    Given I am about to login
    When I enter valid credentials
    Then I am logged

  Scenario: Login invalid
    Given I am about to login
    When I enter invalid credentials
    Then I am logged