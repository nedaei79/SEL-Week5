@tag
Feature: Calculator

  Scenario: get sqrt of dividing of two values
    Given Two input values, 4 and 1
    When I add the two values
    Then I expect the result 2.0

  Scenario Outline: get sqrt of dividing of two values
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 36    | 4      | 3.0    |
      | -36   | 4      | -2.0   |
      | 36    | -4     | -2.0   |
      | -36   | -4     | 3.0    |
      | 36    | 0      | -1.0   |
