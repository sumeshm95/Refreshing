Feature: simple test

  Background: 
    Given I want to write a step with precondition

  @ert
  Scenario: Title of your scenario
    When I complete action

  Scenario: Title of your scenario
    When I completed action

  Scenario Outline: nothing to display
    When I complete action "<name>" "<password>"

    Examples: 
      | name   | password |
      | hello  |    12345 |
      | hello2 |     2345 |
