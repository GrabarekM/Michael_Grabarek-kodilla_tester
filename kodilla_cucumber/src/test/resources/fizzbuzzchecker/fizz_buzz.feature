Feature:  FizzBuzz game

  Scenario Outline: Return correct FizzBuzz result
    Given the input number is <number>
    When I check the FizzBuzz result
    Then the result should be <result>

    Examples:
      | number | result     |
      | 3      | "Fizz"       |
      | 5      | "Buzz"       |
      | 15     | "FizzBuzz"   |
      | 0    | "FizzBuzz"   |
      | 2    | "None"       |
      | 7     | "None"       |
      | 0     | "FizzBuzz"   |