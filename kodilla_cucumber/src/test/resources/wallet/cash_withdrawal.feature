Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Withdrawal exceeding balance
    Given I have deposited $200 in my wallet
    When I request $300
    Then nothing should be dispensed
    And the balance should remain $200

  Scenario: Withdrawal exact balance
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed
    And the balance should be $0

  Scenario: Withdrawal zero amount
    Given I have deposited $200 in my wallet
    When I request $0
    Then nothing should be dispensed
    And the balance should remain $200

  Scenario: Withdrawal negative amount
    Given I have deposited $200 in my wallet
    When I request -$30
    Then nothing should be dispensed
    And the balance should remain $200

  Scenario: Withdrawal from empty wallet
    Given my wallet is empty
    When I request $30
    Then nothing should be dispensed
    And the balance should remain $0