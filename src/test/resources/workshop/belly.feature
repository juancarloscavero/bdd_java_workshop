Feature: Login

  Scenario: Login valid
    Given I am about to login
    When I enter credentials
    Then I am logged
