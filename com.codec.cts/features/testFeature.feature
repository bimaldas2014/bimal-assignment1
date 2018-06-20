Feature: Test cts page

  Scenario: Test with valid credentials
    Given Open firefox and start application
    When I enter valid user id and valid password
    Then User should login successfully
