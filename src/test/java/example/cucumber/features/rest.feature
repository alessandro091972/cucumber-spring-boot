Feature: Greet API

  Scenario: Greet endpoint returns greeting message
    Given the client calls api greet
    Then the client receives status code 200
    And the client receives the message "Hello, Cucumber!"
